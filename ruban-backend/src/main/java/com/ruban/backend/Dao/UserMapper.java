package com.ruban.backend.Dao;

import com.ruban.backend.Entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-09-23 18:11
 * @desc
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@Mapper
public interface UserMapper {
    void UpdateUserInfo(User user);

    User getUserByUserName(String userName);
}
