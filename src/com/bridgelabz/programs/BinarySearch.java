package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.utility;


public class BinarySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,key1;

		System.out.println("Enter the Size of the Array.......");
		n=s.nextInt();

		Integer a[]=new Integer[n]; 
		System.out.println("Enter the Array Elements.........");
		for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();

		Arrays.sort(a);
		System.out.println("Enter the Key Element to Search...");
		key1=s.nextInt();
	

		if(utility.binarySearch(a,key1,0,a.length-1)!=0)
		System.out.println("Element is Found......");
		else System.out.println("Element is  Not Found......");
	
		String[] str=new String[n];
	
		System.out.println("Enter the String Elements.........");
		for(int i=0;i<n;i++)
		str[i]=s.next();
	
		for(int i=0;i<n;i++)
		System.out.println(str[i]);
		String key2;
		System.out.println("Enter the String to Search.....");
		key2=s.next();
	
		if(utility.binarySearch(str,key2,0,a.length-1)!=0)
		System.out.println("The Element is found......");
		else System.out.println("The Element Not Found......");
		s.close();
	}
}
