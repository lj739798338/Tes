package com.it.bean;
/**
 * 测试Spring setter;
* @ClassName: UserInfo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author lijing
* @date 2019年4月2日 下午9:14:42 
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
