package com.bridgelabz.programs;

import com.bridgelabz.utility.utility;

public class QuestionToFindNumber {

	public static void main(String[] args) {
		    int number = Integer.parseInt(args[0]);
	        int n = (int) Math.pow(2, number);
	        System.out.printf("Think of an integer between %d and %d\n", 0, n-1);
	        int secretNumber = utility.search(0, n);
	        System.out.printf("Your number is %d\n", secretNumber);
	}
}
