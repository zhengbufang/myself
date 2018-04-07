package com.zy.sboot.mvc;

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
public class OkController {
       
	   @RequestMapping("ok")
	   String isOk(){
		      return "of course Ok";    
	   }
}
