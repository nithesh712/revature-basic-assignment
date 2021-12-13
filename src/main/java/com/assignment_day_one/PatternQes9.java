package com.assignment_day_one;

public class PatternQes9 {

	public static void main(String[] args){
		System.out.println("0");
		for(int i = 1;i<=7;i++) {
			for(int j = 0; j <= i; j++) {
				if(j==0) {
					System.out.print("0 ");
				} else {
					System.out.print(i*j+" ");
				}
			}
			System.out.println();
			}
		} 

}
