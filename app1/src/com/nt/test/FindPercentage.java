package com.nt.test;
import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	     Scanner sc=new Scanner(System.in);
	  
	     
		int phy,chem,bio,math,comp,totl;
	     double perc;
	     System.out.println("Eneter five subjects marks");
	     System.out.println("Enetr Phy no:");
	     phy=sc.nextInt();
	     System.out.println("Enetr chem no:");
	     chem=sc.nextInt();
	     System.out.println("Enetr bio no:");
	     bio=sc.nextInt();
	     System.out.println("Enetr math no:");
	     math=sc.nextInt();
	     System.out.println("Enetr compno:");
	     comp=sc.nextInt();
	     totl=phy+chem+bio+math+comp;
	     perc=totl/5.0;
	     System.out.println("total Marks="+totl);
	     System.out.println("percentage="+perc);
	     System.out.println("Grade=");
	     if(perc>=90)
	    	 System.out.println("Grade A");
	     else if(perc>=80)
	    	 System.out.println("Grade B");
	     else if(perc>=70)
	    	 System.out.println("Grade C");
	     else if(perc>=60)
	    	 System.out.println("Grade D");
	     else if(perc>=40)
	    	 System.out.println("Grade E");
	     else if(perc<40)
	    	 System.out.println("Grade F");
	     else
	    	 System.out.println("Fail");
	     
	}
}
