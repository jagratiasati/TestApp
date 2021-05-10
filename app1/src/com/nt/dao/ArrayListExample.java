package com.nt.dao;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListExample {
	
	public static void main(String ars[]) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("bnana");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}
	
	}


