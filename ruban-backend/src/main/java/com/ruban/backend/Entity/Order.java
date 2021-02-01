package com.ruban.backend.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-29 10:53
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Data
public class Order {
    @JSONField(name = "orderId")
    public String orderId;
    @JSONField(name = "consumerName")
    public String consumerName;
    @JSONField(name = "consumerPhone")
    public String consumerPhone;
    @JSONField(name = "consumerEmail")
    public String consumerEmail;
    // 消费者联系方式
    @JSONField(name = "consumerContact")
    public String consumerContact;
    // 消费者微信信息
    @JSONField(name = "consumerWxInfo")
    public String consumerWxInfo;
    @JSONField(name = "orderStatus")
    public String orderStatus;
    @JSONField(name = "orderType")
    public String orderType;
    @JSONField(name = "orderPrice")
    public String orderPrice;
    // 支付方式
    @JSONField(name = "orderPayMethod")
    public String orderPayMethod;
    // 支付信息
    @JSONField(name = "orderPayInfo")
    public String orderPayInfo;
    @JSONField(name = "createTime")
    public String createTime;
    @JSONField(name = "updateTime")
    public String updateTime;
}
