package com.ruban.backend.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-23 18:13
 * @desc 点击按钮埋点
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Data
public class ItemClick {

    @JSONField(name = "itemId")
    private int itemId;
    @JSONField(name = "itemName")
    private String ItemName;
    // 点击时间
    @JSONField(name = "clickTime")
    private String clickTime;
    // 按钮点击的人
    @JSONField(name = "clickedUser")
    private String clickedUser;
}
