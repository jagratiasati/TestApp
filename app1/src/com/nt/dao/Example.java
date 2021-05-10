package com.nt.dao;

 class Example {
	Example(){
		System.out.println("Example Zero-param");
		
	}
	
	Example(int a){
		System.out.println("Example int-param");
		
	}
}

class Sample extends Example{
	
	Sample(){
	 
	 System.out.println("Sample Zero-param");
	 
 }
	Sample(int a){
		 super(50);
		 System.out.println("Sample int-param");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Sample s1= new Sample();
           Sample s2=new Sample(10);
         //  Example e1=new Example(10);
	}

}
