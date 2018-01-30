package com.charvikent.myapplication.emp;

public class Employee {
	private int id;
	private String name;
	private String role;
	private float salary;
	private String dept;


	public Employee(int id, String name, String role, float salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.dept = dept;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}
}
	


	
