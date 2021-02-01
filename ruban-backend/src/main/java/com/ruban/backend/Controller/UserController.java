package com.ruban.backend.Controller;

import com.alibaba.fastjson.JSONObject;
import com.ruban.backend.Entity.User;
import com.ruban.backend.Service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-23 18:40
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @Resource
    private UserServiceImpl userService;

//    @RequestMapping(value = "/getUserByUserName", method = RequestMethod.POST)
//    public RestResult getUserByUserName(@RequestBody User user) {
//        String userName = user.getUserName();
//        logger.info("getUserByUserName userName:{}", userName);
//        User selectUser = userService.getUserByUserName(userName);
//        return RestResult.successResult(JSONObject.toJSONString(selectUser));
//    }
}
