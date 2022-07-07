package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="userinfo")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	@Column(name="name",length = 200,nullable = false)
	private String name;
	@Column(name="age",nullable = false)
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="salary",length = 10,precision = 2)
	private double salary;
	@Column(name="address",length = 200,nullable = false)
	private String address;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", salary="
				+ salary + ", address=" + address + "]";
	}
	

	

}
