package com.assignment_day_one;

public class AddingOddInRange {

	public static void main(String[] args) {
		int i, N=99, total = 0;
		for(i=1; i <= N; i++){
            if((i%2) == 1){
            	total += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to " + N + " = " + total);
		
	}

}
