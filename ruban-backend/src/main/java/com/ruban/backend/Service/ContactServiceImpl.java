package com.ruban.backend.Service;

import com.alibaba.fastjson.JSONObject;
import com.ruban.backend.Entity.ContactInfo;
import com.ruban.backend.Entity.EmailExample;
import com.ruban.backend.Service.ServiceImpl.ContactService;
import com.ruban.common.RubanConstant;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.net.URLDecoder;
import java.text.MessageFormat;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-22 18:48
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Service
@PropertySource("classpath:contact.yml")
public class ContactServiceImpl implements ContactService {

    private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);


    @Value("${phone}")
    private String phone;

    @Value("${email}")
    private String email;

    @Value("${sendToEmail}")
    private String sendToEmail;

    public ContactInfo getContactInfo() {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setEmail(email);
        contactInfo.setPhone(phone);
        return contactInfo;
    }

    /**
     * 新订单待联系
     * @param contactInfo
     * @return
     */
    public EmailExample contactOrder(ContactInfo contactInfo) {
        EmailExample emailExample = new EmailExample();
        emailExample.setSendToEmail(sendToEmail);
        emailExample.setEmailTitle(formatEmailTitle(contactInfo));
        emailExample.setEmailContent(formatEmailContent(contactInfo));
        return emailExample;
    }

    // 组装邮件标题
    private String formatEmailTitle(ContactInfo contactInfo){
        return MessageFormat.format(RubanConstant.emailTitle,RubanConstant.itemMap.get(contactInfo.getItemId()));
    }
    // 组装邮件文案内容
    private String formatEmailContent(ContactInfo contactInfo){
        String nickName;
        try {
            String wxInfo = URLDecoder.decode(StringUtils.trim((String) contactInfo.getWxUserInfo()),"UTF-8");
            JSONObject wxUserInfo = JSONObject.parseObject(wxInfo);
            nickName = wxUserInfo.getString("nickName");
        } catch (Exception e){
            logger.error("email wx userInfo is empty");
            nickName = RubanConstant.nickName;
        }
        return MessageFormat.format(RubanConstant.emailContent,nickName,RubanConstant.itemMap.get(contactInfo.getItemId()),contactInfo.getPhone());
    }
}
