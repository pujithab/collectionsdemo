package com.charvikent.myapplication;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		  list.add("Ravi");  
		  list.add("Vijay");  
		  list.add("Ajay");

	
	for(String items:list)
	
System.out.println(items);
	System.out.println("-------after delete------");
	list.remove(0);
	
	for(String items:list)
		  
		
		System.out.println(items);
			
		list.set(0,"puja");
		System.out.println("........after updation............");
		
			 Iterator<String> items=list.iterator();  
		  while(items.hasNext()){  
		System.out.println(items.next());
		
		  }
		list.add("leela");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		
		
	
}
	
}
