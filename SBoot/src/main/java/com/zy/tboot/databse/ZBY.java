package com.zy.tboot.databse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zby")
public class ZBY {
    
	private int id;
	private String name;
	private String sex;
	private int age;
     
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	@Column
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
