package com.it.bean;
/**
 * ����Spring setter;
* @ClassName: UserInfo 
* @Description: TODO(������һ�仰��������������) 
* @author lijing
* @date 2019��4��2�� ����9:14:42 
*
 */
public class UserInfo {

	private String name;
	private Integer age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
	public UserInfo(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
