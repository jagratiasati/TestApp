package com.nt.dao;

public class ReverseStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int[] n = {10,40,60,70};
		 for(int i=0; i<n.length; i++) {
			 
			 System.out.println(n[i]);
		 }
		 //reverse code
		 
		 int temp;
		 int start=0;
		 int end=n.length-1;
		 
		 while(start<end) {
			 temp=n[start];
			 n[start]=n[end];
			 n[end]=temp;
			 
			 start++;
			 end--;
			 
		 }
		 
		 System.out.println("print array after reversing");
	

	   for(int i=0; i<n.length; i++) {
		   System.out.println(n[i]);
	   }
}
}
