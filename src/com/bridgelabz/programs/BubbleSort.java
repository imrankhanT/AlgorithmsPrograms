package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("Enter the Size of the Array....");
		n=scanner.nextInt();
 
		Integer a[]=new Integer[n];
//		 startTimer=(int) System.currentTimeMillis();
		System.out.println("Enter the Array Elements.....");
		for(int i=0;i<n;i++)
		a[i]=scanner.nextInt();
		
		System.out.println("Sorted Integers Elements are........");
		Integer[] b=utility.bubbleSort(a);
		utility.display(b);
//	    stopTimer=(int) System.currentTimeMillis();
	
//		 
//		System.out.println("Elapsed Time is............"+(stopTimer-startTimer)+" seconds");
//		
//		startTimer=stopTimer=0;
		String [] str=new String[n];
		//startTimer=(int) System.currentTimeMillis();
		System.out.println("Enter the String......");
		for(int i=0;i<str.length;i++) 
        str[i]=scanner.next();
		
		
		System.out.println("Sorted Strings Elements are......");
		String[] str2=utility.bubbleSort(str);
		utility.display(str2);
//		stopTimer=(int) System.currentTimeMillis();
//		System.out.println("Elapsed Time is............"+(stopTimer-startTimer)+" Seconds");
		scanner.close();

	}

}
