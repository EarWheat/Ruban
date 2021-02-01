package com.ruban.backend.Service.ServiceImpl;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-28 15:33
 * @desc 发送邮件接口
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
public interface EmailServiceImpl {
    void sendEmail(String to, String subject, String content);
}
