package com.nt.test;

public class CommandArgsThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String [][] argCopy=new String[2][2];
       int x;
       argCopy[0]=args;
       x  = argCopy[0].length;
       for(int y=0;  y<x; y++)
       {
    	   System.out.println("" +argCopy[0][y]);
    	   
       }
	}

}
