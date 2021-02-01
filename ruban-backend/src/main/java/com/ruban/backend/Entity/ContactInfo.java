package com.ruban.backend.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-22 18:01
 * @desc 联系方式
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Data
@Component
public final class ContactInfo {
    @Value("${phone}")
    @JSONField(name = "phone")
    private String phone;

    @Value("${email}")
    @JSONField(name = "email")
    private String email;

    @JSONField(name = "itemId")
    private String itemId;

    @JSONField(name = "wxUserInfo")
    private Object wxUserInfo;

}
