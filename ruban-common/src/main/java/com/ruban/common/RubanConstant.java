package com.ruban.common;

import java.util.HashMap;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-28 16:38
 * @desc 项目常量类
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
public class RubanConstant {
    public static final HashMap<String, String> itemMap;
    public static final String nickName = "makeMoney";
    public static final String emailTitle = "【{0}】有新单了！赶紧赚钱吧！";
    public static final String emailContent = "用户{0}需要{1},赶紧联系一下吧！手机{2}";

    static {
        itemMap = new HashMap<>();
        itemMap.put("logoDesign","Logo设计");
        itemMap.put("webDesign","Web网页设计");
        itemMap.put("wxProgram","微信小程序");
        itemMap.put("wxPublic","微信公众号");
    }
}
