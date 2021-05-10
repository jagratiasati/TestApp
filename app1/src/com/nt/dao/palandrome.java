package com.nt.dao;

import java.util.Scanner;

public class palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Eneter the size of an array");
		
		int no = scn.nextInt();
		int rev=0,rem;
		int temp=no;
		
		while(temp!=0) {
			 rem= temp%10;
			 rev=rev*10+rem;
			 temp=temp/10;
		}
		 
		
		if(no==rev) {
			System.out.println(no +" is palandrome number");
		}
		else {
			System.out.println(no+"is not palindrome");
		}
		}
		
	}


