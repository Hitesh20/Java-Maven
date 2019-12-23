package com.practice.model;

import java.util.ArrayList;





public class Data {
	private int id;
	private String f_name;
	private String s_name;
	private int age;

    private ArrayList<Data> list = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return "Data [id=" + id + ", f_name=" + f_name + ", s_name=" + s_name + ", age=" + age + "]";
		
	}
	
	
	
}
