package com.charvikent.myapplication.otest;

import java.util.ArrayList;

public class TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student(1,"aa",22,1500);
Student s2= new Student(2,"bb",21,222);
Student s3= new Student(3,"cc",22,333);
ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);
al.add(s2);
al.add(s3);

for(Student items:al)
{
	System.out.println(items.getRollno()+" "+items.getName()+" "+items.getAge()+" "+items.getSal());
}
System.out.println(".....after updation......");
s2.setAge(23);
s1.setRollno(11);
s3.setName("a");
for(Student items:al)
{
	System.out.println(items.getName()+" "+items.getName()+" "+items.getAge());
}
System.out.println("..........after delete.......");
al.remove(1);
for(Student items:al)
{
	System.out.println(items.getRollno()+" "+items.getName()+" "+items.getAge());

	
}
	
	}

}
