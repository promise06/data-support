package com.haiercash.data.support.client.dao.db1;

import com.haiercash.data.support.client.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Qualifier("db1SqlSessionTemplate")
@Mapper
public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);

}
