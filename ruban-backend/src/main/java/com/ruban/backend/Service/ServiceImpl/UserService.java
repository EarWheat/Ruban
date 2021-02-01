package com.ruban.backend.Service.ServiceImpl;

import com.ruban.backend.Entity.User;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-23 18:26
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
public interface UserService {
    void updateUserInfo(User user);

    User getUserByUserName(String userName);
}
