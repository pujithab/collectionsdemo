package com.charvikent.myapplication.otest;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private double sal;
	Student(int rollno, String name, int age, double sal )
	{
		this.rollno= rollno;
		this.name= name;
		this.age= age;
		this.sal= sal;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public double getSal() {
		return sal;
	}
	
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
	
	
	

}
