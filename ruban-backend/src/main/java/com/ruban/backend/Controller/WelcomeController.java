package com.ruban.backend.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-10-15 19:25
 * @desc 测试欢迎页
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@RestController
@RequestMapping("/")
public class WelcomeController {

//    @RequestMapping("/")
//    public RestResult Welcome() {
//        return RestResult.successResult("Hello liuzhaojun");
//    }

    @RequestMapping("/")
    public JSONObject Welcome() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errno",0);
        jsonObject.put("errmsg","SUCCESS");
        jsonObject.put("data","Hello liuzhaojun");
        return jsonObject;
    }
}
