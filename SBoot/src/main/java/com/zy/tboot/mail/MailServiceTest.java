package com.zy.tboot.mail;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailServiceTest {
      
	@Autowired  
	private MailService mailService;
	
	@RequestMapping("/send")
	public String send(){
		HashMap<String,String> hash = new HashMap<String,String>();
		mailService.sendSimpleMail("260135553@qq.com","test simple mail"," hello this is simple mail");
		System.out.println("123717647");
		return "hello";
	}
	
}
