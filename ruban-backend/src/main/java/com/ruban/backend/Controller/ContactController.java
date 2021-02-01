package com.ruban.backend.Controller;

import com.alibaba.fastjson.JSONObject;
import com.pangu.Http.response.RestResult;
import com.pangu.Http.response.ResultEnum;
import com.ruban.backend.Entity.ContactInfo;
import com.ruban.backend.Entity.EmailExample;
import com.ruban.backend.Service.ContactServiceImpl;
import com.ruban.backend.Service.EmailService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-22 17:51
 * @desc 联系我们，数据埋点，主动发送短信留存用户
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@RestController
@RequestMapping("/ruban")
public class ContactController {

    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @Resource
    private ContactServiceImpl contactService;

    @Resource
    private EmailService emailService;

    @RequestMapping("/getContactInfo")
    public RestResult ContactUs() {
        return RestResult.successResult(JSONObject.toJSONString(contactService.getContactInfo()));
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public RestResult beginContact(@RequestBody ContactInfo contactInfo) {
        if (StringUtils.isEmpty(contactInfo.getPhone()) || StringUtils.isEmpty(contactInfo.getItemId())) {
            return RestResult.failResult(ResultEnum.PARAM_EMPTY);
        }
        EmailExample emailExample = contactService.contactOrder(contactInfo);
        emailService.sendEmail(emailExample.sendToEmail,emailExample.emailTitle,emailExample.emailContent);
        return RestResult.successResult();
    }
}
