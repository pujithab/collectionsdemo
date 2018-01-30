package com.charvikent.myapplication.emp;

import java.util.ArrayList;
import java.util.List;


public class EmployeeTest {
	public static void main(String[] args) {
		
	Employee e1= new Employee(1,"a","xy",111.99f,"dp1");
	Employee e2= new Employee(2,"b","yz",222.11f,"dp2");
	Employee e3= new Employee(3,"c","zx",333,"dp3");
	Employee e4= new Employee(4,"d","xz",444,"dp4");
	
	
	List<Employee> empl = new ArrayList<Employee>();
	
	
	empl.add(e1);
	empl.add(e2);
	empl.add(e3);
	empl.add(e4);
	
	for(Employee details:empl)
	{
		System.out.println("id="+details.getId() +"\nname="+details.getName()+"\nrole="+details.getRole()+"\nsal="+details.getDept());
		
}
	System.out.println(".....after updation......");
	
	e3.setId(5);
	e4.setId(2);
	
	for(Employee details: empl)
	{
		System.out.println("id="+details.getId() +"\nname="+details.getName()+"  role="+details.getRole()+"  sal="+details.getDept());

}
	System.out.println(".....after delition......");
	empl.remove(e4);
	for(Employee details: empl)
	{
		System.out.println("id="+details.getId() +"\nname="+details.getName()+"  role="+details.getRole()+"  sal="+details.getDept());

}
	
	}
	
}