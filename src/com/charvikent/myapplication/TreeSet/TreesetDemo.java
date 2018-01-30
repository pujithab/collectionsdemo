package com.charvikent.myapplication.TreeSet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = formatter.parse("31/03/2015");
		Date date1 = formatter.parse("3/03/2017");
		Date date2 = formatter.parse("1/01/2015");
		Date date3 = formatter.parse("2/05/2016");
		
		Employee e1= new Employee(1,"a","xy",111.99f,"dp1",date);
		Employee e2= new Employee(2,"d","yz",222.11f,"dp2",date1);
		Employee e3= new Employee(3,"c","zx",333,"dp3",date2);
		Employee e4= new Employee(4,"d","xz",444,"dp4",date3);
		
		Set<Employee> Emp=new TreeSet<Employee>();
		
		Emp.add(e1);
		Emp.add(e2);
		Emp.add(e3);
		Emp.add(e4);
		for(Employee details: Emp)
		{
			String ODate = formatter.format(details.getJdate());
			System.out.println("id="+details.getId() +"\nname="+details.getName()+"  role="+details.getRole()+"  sal="+details.getDept()+"  jdate"+ODate);

	}
		System.out.println(".....after updation......");
		
		e3.setId(5);
		e4.setId(2);
		
		for(Employee details: Emp)
		{
			System.out.println("id="+details.getId() +"\nname="+details.getName()+"  role="+details.getRole()+"  sal="+details.getDept());

	}
		System.out.println(".....after delition......");
		Emp.remove(e4);
		for(Employee details: Emp)
		{
			System.out.println("id="+details.getId() +"\nname="+details.getName()+"  role="+details.getRole()+"  sal="+details.getDept());

	}
		
		
		
		
		

}
}