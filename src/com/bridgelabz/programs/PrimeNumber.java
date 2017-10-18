package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int start,end;
		System.out.println("Enter the start and end number to find a prime number....");
		start=scanner.nextInt();
		end=scanner.nextInt();
		String primeNumber=utility.isPrimeNumber(start,end);
		System.out.println(primeNumber.toString());
		scanner.close();
	}
}
