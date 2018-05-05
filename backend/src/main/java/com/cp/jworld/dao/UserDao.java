package com.cp.jworld.dao;

import com.cp.jworld.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends EntityDao<User> {
}
