package com.charvikent.myapplication.Book;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		//creating map of book with Integer
		//Map<Integer,Book> map= new HashMap<Integer,Book>();
		
		//creating map of book with String
		//Map<String,Book> map = new LinkedHashMap<String,Book>();
		Map<Book,String> map = new LinkedHashMap<Book,String>();
		//creating books
		Book b1 = new Book(111,"first book","abc",6);
		Book b2 = new Book(222,"second book","bca",7);
		Book b3 = new Book(333,"third book","cab",8);
		Book b4 = new Book(444,"forth book","bbb",4);
		Book b5 = new Book(44,"forth book","bbb",4);
		Book b6 = new Book(44,"forth book","bbb",4);
		
		
		 //Adding Books to map with integer  
//		map.put(1, b1);
//		map.put(2, b2);
//		map.put(3, b3);
//		map.put(4, b4);
//		map.put(2, b5);
		
		 //Adding Books to map with integer  
//		map.put("book1 is ", b1);
//		map.put("book2 is ", b2);
//		map.put("book3 is ", b3);
//		map.put("book4 is ", b4);
//		map.put("book5 is ", b5);
		
		map.put(b1, "Details");	
		map.put(b2, "value");
		map.put(b3, "value");
		map.put(b4, "value");
		map.put(b5, "value");
		map.put(b6, "value");
		
		
		
		System.out.println(" 1 . for loop for entire map");
		for(Map.Entry entry:map.entrySet()){
		System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		System.out.println(" ******2 . for loop for entire map");
//		for(Map.Entry<Integer,Book> entry: map.entrySet()){
//		for(Map.Entry<String, Book> entry: map.entrySet()){
//			int key=entry.getKey();
		for(Map.Entry<Book,String> entry: map.entrySet()){
			String key=entry.getValue();
	        Book b=entry.getKey(); 
		System.out.println("id =  "+b.getId()+" name=  "+ b.getName()+" author=  "+ b.getAuthor() +" quantity=  "+ b.getQuantity());
		}
		
		System.out.println(" 3 . printing  only keys");
//		for(Integer Key : map.keySet()){
		for(Book Key : map.keySet()){
			System.out.println("key = " + Key);
		}
		System.out.println(" 3 . printing only values");
		for(String value : map.values()){
		
			System.out.println("Values = " + value);
		}
		
		//removing  value 
		map.remove(1);
//		for(Integer Key : map.keySet()){
//		for(String Key: map.keySet()){
//			System.out.println("key = " + Key);
//			 System.out.println("Values after remove: "+ map);
//		}
		for(Book Key: map.keySet()){
			System.out.println("Value = " + Key);
			 System.out.println("Values after remove: "+ map);
		}
		
		//updating
		b2.setQuantity(23);
		b1.setAuthor("nnn");
		b3.setName("a");
//		for(Map.Entry<Integer,Book> entry: map.entrySet()){
//		int key=entry.getKey();  
		for(Map.Entry<Book, String> entry: map.entrySet()){
			String Key=entry.getValue();
	        Book b=entry.getKey(); 
	        System.out.println("id =  "+b.getId()+" name =  "+ b.getName()+" author =  "+ b.getAuthor() +" quantity =  "+ b.getQuantity());
		}
		
		
		
			
		
		
		
		

	}

}
