package com.insta;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 17;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " prime");
	    else
	      System.out.println(num + " not a prime");
	  }
}
