package com.edu.model;

import java.io.Serializable;

public class User implements Serializable {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIphone() {
		return iphone;
	}
	public void setIphone(int iphone) {
		this.iphone = iphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQianming() {
		return qianming;
	}
	public void setQianming(String qianming) {
		this.qianming = qianming;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	private int iphone;
	private String password;
	private String image;
	private String username;
	private int sex;
	private String address;
	private String qianming;
	private int status;
	
	public User(){
		
	}
	public User(int id,int iphone,String password,String image,String username,
			int sex,String address,String qianming,int status){
		this.id=id;
		this.iphone=iphone;
		this.password=password;
		this.image=image;
		this.username=username;
		this.sex=sex;
		this.address=address;
		this.qianming=qianming;
		this.status=status;
	}
	public String toString(){
		return id+iphone+password+image+username+sex+address+qianming+status;
	}
}
