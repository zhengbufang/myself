package com.zy.sboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController == @Controller + @Requestbody
 * @author 郑不凡
 * @date 2017年11月25日下午3:52:58
 * @version 1.0
 */
@RestController
@Controller
public class MyControlle {

	@RequestMapping("/hello")
	String hello() {

		return "hello";
	}

}
