package com.zy.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

import com.zy.tboot.databse.User;

public interface UserMapper {
    
	@Select("SELECT * FROM zby_user where name = #{name}")
	public User findByName(String name);
}
