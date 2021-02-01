package com.ruban.backend.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigInteger;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-23 18:01
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Data
public class User {
    @JSONField(name = "userId")
    private BigInteger userId;

    @JSONField(name = "userName")
    private String userName;

    @JSONField(name = "phone")
    private BigInteger phone;

    @JSONField(name = "lastLoginTime")
    private String lastLoginTime;

    @JSONField(name = "createTime")
    private String createTime;

    @JSONField(name = "updateTime")
    private String updateTime;

    @JSONField(name = "weChatInfo")
    private String weChatInfo;
}
