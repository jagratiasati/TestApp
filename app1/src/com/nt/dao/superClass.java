package com.nt.dao;

 class superClass {
	superClass()
	{
		this(10);
		System.out.println("super no arg");
	}
	
	superClass(int a)
	{
		this("abc");
		System.out.println("super int arg");
	}
	superClass(String s)
	{
		System.out.println("super string arg");
	}
 }
	
	class subClass extends superClass{
		
	subClass()
	{
		this(10);
		System.out.println("sub no arg");
	}
	subClass(int a)
	{
		this("abc");
	
		System.out.println("sub int arg");
	}
	subClass(String str)
	{
		
		System.out.println("sub string arg");
	}
	}
	
	class ThisSuperDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new subClass();
          System.out.println();
          new subClass(10);
          System.out.println();
          new subClass("abc");

	}
	}


