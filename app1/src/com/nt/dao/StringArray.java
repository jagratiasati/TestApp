package com.nt.dao;

public class StringArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      
		String name[]= new String[3];
		name[0]="laptop";
		name[1]="keyboard";
		name[2]="mouse";
	//	name[3]="desktop";
		  
		for(int i=0; i<3;i++) {
			
			System.out.println(name[i]);
			System.out.println("Length ["+i+"]="+name[i].length());
		}
	}

}
