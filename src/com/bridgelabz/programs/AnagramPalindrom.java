package com.bridgelabz.programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class AnagramPalindrom {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the start and number to find the prime number....");
		int start=scanner.nextInt();
		int end=scanner.nextInt();
		String primeNumber=utility.isPrimeNumber(start,end);


		String[] anagram=primeNumber.split(" ");
		System.out.println(primeNumber);
		
		int[] numbers = new int[anagram.length];
		for(int i = 0;i < anagram.length;i++)
		numbers[i] = Integer.parseInt(anagram[i]);
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		System.out.println("The Angram number are.......");
		for(int i=0;i<anagram.length;i++){
		for(int j=i+1;j<anagram.length;j++) {
		if(utility.anagramDetection(anagram[i],anagram[j])) {
		lhs.add(anagram[i]);
		lhs.add(anagram[j]);
				                                            }
			                                 }
		                                  }
		System.out.println(lhs);
		System.out.println("Palindrom Numbers are........");
		String[] anagramNumber=new String[lhs.size()];
		
		lhs.toArray(anagramNumber);
		utility.palindrom(anagramNumber);
		scanner.close();
	}

}
