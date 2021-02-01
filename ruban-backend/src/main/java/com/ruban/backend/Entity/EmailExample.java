package com.ruban.backend.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-28 16:42
 * @desc 邮件发送模版
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Data
@Component
public class EmailExample {
    @JSONField(name = "sendToEmail")
    public String sendToEmail;
    @JSONField(name = "emailTitle")
    public String emailTitle;
    @JSONField(name = "emailContent")
    public String emailContent;
}
