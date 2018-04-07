package com.zy.sboot.controller.json;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class ResultBean<T> {
	private int code;
	private String message;
	private List<T> result;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date date;
	@JSONField(serialize=false)
	private String sex;
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
    
	
}
