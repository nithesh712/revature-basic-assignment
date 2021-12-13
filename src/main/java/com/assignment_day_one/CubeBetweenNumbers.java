package com.insta;

public class CubeBetweenNumbers {

	public static void main(String[] args) {
		int num;
		int cube;
		
		for (num=1; num<=10; num++){
			cube= num * num * num;
			System.out.println(num+"\t"+cube);	
		}
	}

}
