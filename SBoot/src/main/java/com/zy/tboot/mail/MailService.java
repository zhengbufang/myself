package com.zy.tboot.mail;

public interface MailService {
     
	void sendSimpleMail(String to, String subject, String content);
}
