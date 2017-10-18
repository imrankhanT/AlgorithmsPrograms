package com.bridgelabz.programs;

import java.util.*;

import com.bridgelabz.utility.utility;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1,string2;

		System.out.println("Enter the string1.......");
		string1=scanner.nextLine().toLowerCase().replace(" ","");

		System.out.println("Enter the string2.......");
		string2=scanner.nextLine().toLowerCase().replace(" ", "");

	
		
		if(utility.anagramDetection(string1,string2))
		System.out.println("Strings are  Anagram to Each Other....");
		else System.out.println("Strings are not Anagram to Each Other....");

        scanner.close();

	}

}
