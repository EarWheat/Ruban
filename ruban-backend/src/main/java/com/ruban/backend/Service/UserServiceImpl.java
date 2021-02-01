package com.ruban.backend.Service;

import com.ruban.backend.Dao.UserMapper;
import com.ruban.backend.Entity.User;
import com.ruban.backend.Service.ServiceImpl.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-23 18:27
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void updateUserInfo(User user) {
        userMapper.UpdateUserInfo(user);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

}
