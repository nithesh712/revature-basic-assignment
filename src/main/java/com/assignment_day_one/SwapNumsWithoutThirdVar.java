package com.insta;

public class SwapNumsWithoutThirdVar {

	public static void main(String[] args) {
		int x = 10, y = 5;
		 
	    x = x + y;
	    y = x - y;
	    x = x - y;
	    System.out.println("X is " + x);
	    System.out.println("Y is "+ y);
	}

}
