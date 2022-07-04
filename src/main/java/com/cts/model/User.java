package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	@Column(name="uname",length = 200,nullable = false)
	private String name;
	@Column(name="age",nullable = false)
	private int age;
	@Column(name="salary",length = 10,precision = 2)
	private double salary;
	@Column(name="address",length = 200,nullable = false)
	private String address;
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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
		return "User [uid=" + uid + ", name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
}
