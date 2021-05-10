package com.nt.dao;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scn = new Scanner(System.in);
		System.out.println("Eneter the size of an array");
		int n = scn.nextInt();
		
		
		//Decalare an array
       
		int arr[]= new int[n];
		System.out.println("Enter an array values");
		
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		int temp;
		 
		int  start=0;
		int end=n-1;
		
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		System.out.println("pritn array after reversing" + ",");
	
	for( int i =0; i<n; i++) {
		System.out.println(arr[i]);
		}
		
		}
}
