package com.zy.tboot.databse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller

/**
 * 127.0.0.1:8080/ok访问不到。   
 * 猜测是SpringBoot是通过运行类包名来找扫描@controller或者@restcontroller
 * 所以跟主类不在同一个包是映射不到的
 * 
 * @author 郑不凡
 * @date 2017年11月25日下午4:04:41
 * @version 1.0
 */
public class OkControllerDataBase {
       
	@Autowired
	private UserDao userDao;
	
	   @RequestMapping("saveUser")
	   String saveUser(){
		      User user = new User();
		      user.setEmail("aslkasdl@163.com");
		      user.setFace("/image/history/image/1503124212.jpg");
		      user.setName("zby");
		      user.setSex("男");
		      userDao.save(user);
		      return "user is ok";
	   }
	   @RequestMapping("queryUser")
	   User queryUser(){
		      return userDao.findByName("zby");
	   }
}
