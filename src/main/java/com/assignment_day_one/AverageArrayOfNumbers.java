package com.assignment_day_one;

public class AverageArrayOfNumbers {

	public static void main(String[] args) 
	{
        int n, sum = 0;
        float average;
        int a[] = {70, 65, 60, 55, 50};
        for(int i = 0; i < a.length ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / a.length;
        System.out.println("Average:"+average);
    }

}
