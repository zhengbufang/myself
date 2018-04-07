package com.zy.sboot.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.mybatis.mapper.UserMapper;

@RestController
public class MyBatisControl {
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/username/{name}")
	public Object getUserByName(@PathVariable(value="name") String name){
		return userMapper.findByName(name);
	}

}
