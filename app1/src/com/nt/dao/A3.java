package com.nt.dao;

public class A3 {
	int x=m1();
	int m1() {
		System.out.println("A NSV");
		return 10;
	}
	{
		System.out.println("A NSB");
	
	}
	
	A3(){
		System.out.println("A constructor");
	}
	}

class B3 extends A3{
	int y = m2();
	int m2() {
		System.out.println("B NSV");
		   return 20;
			 }
	
	{
		System.out.println("B NSB");
		
	}
B3(){
	System.out.println("B Constructor");
}
public static void main(String[] args) {
	System.out.println("B main");
	B3 b1= new B3();
	System.out.println("\nB main X:"+b1.x);
	System.out.println("B main y:"+b1.y);
}

}



