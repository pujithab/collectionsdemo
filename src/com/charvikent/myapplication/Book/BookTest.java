package com.charvikent.myapplication.Book;

import java.util.LinkedHashSet;
import java.util.Set;

public class BookTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar",8);  
		 Book b2=new Book(102,"Data Communications & Networking","Mc Graw Hill",4);  
		 Book b3=new Book(103,"Operating System","Galvin",6); 
		 
	Set<Book> books=new LinkedHashSet<Book>();
	
	books.add(b1);  
    books.add(b2);  
    books.add(b3); 
    
    
    for(Book Details:books)
    {
    	System.out.println("id="+Details.getId()+"name="+Details.getName());
    	
    }
    
    System.out.println(" duplicate");
    
    Book b4=new Book(101,"Let us C","Yashwant Kanetkar",8);
    books.add(b4);
    
    if (b1.equals(b4))
    {
        System.out.println("they're equal");
    }
    for(Book Details:books)
    {
    	System.out.println("id="+Details.getId());
    	
    }
    
    
    System.out.println(" again duplicate");
    
    books.add(b2);
    
    for(Book Details:books)
    {
    	System.out.println("id="+Details.getId());
    	
    }
    
    
    System.out.println("deletion");
    
    books.remove(b4);
   
    
    for(Book Details:books)
    {
    	System.out.println("id="+Details.getId());
    	
    }
    
    
    System.out.println("after update");
    b1.setName("only c");
    
   
    for(Book Details:books)
    {
    	System.out.println("id="+Details.getId()+"name="+Details.getName());
    	
    }
    
    System.out.println("testing hash code");
    
    String Str = "leela";
    String str1 = "leela";
    String str2 = new String("leela");
    System.out.println("Hashcode for Str :" + Str.hashCode() + " \nHashcode for Str1 :" + Str.hashCode()+ "\nHashcode for Str2 :" + Str.hashCode() );
    
    
    
    
    
    
    
    
   
    
    
    
   
    
    
    
		 

	}

}
