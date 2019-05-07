package com.bdqn.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.bdqn.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByName(@Param("name")String name);


}