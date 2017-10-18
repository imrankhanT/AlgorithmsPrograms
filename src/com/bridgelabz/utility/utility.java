package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Scanner;

public class utility {
	public static int total=0,index=0;
	/**
	 * @param anagram1
	 * @param anagram2
	 * @return
	 * program to find detect the Anagram of a String
	 */
	public static boolean anagramDetection(String anagram1,String anagram2) {
		
	    char char1[]=anagram1.toCharArray();
	    char char2[]=anagram2.toCharArray();
	    Arrays.sort(char1);
	    Arrays.sort(char2);
	    String string1=String.valueOf(char1);
	    String string2=String.valueOf(char2);
	   
	    	if(!string1.equals(string2))
	    		return false;
	 
	    return true;
	    }
	 
	/**
	 * @param i
	 * @param n
	 * logic for finding a prime number....
	 */
	public static String isPrimeNumber(int start,int end) {
		String primeNumber = "";
		for (int i = start; i <= end; i++)         
	    { 		  	  
	       int counter=0; 	  
	       for(int num =i; num>=1; num--)
		  {
	          if(i%num==0)
		     {
			counter = counter + 1;
		     }
		  }
	 	  if (counter ==2)
		  {
		  primeNumber = primeNumber + i+" ";
		  }	
		}
		return primeNumber;
	}
	 
	public static void palindrom(String[] arraysAnagram) {
		int[] numbers = new int[arraysAnagram.length];
		for(int i = 0;i < arraysAnagram.length;i++) {
		   numbers[i] = Integer.parseInt(arraysAnagram[i]);
		}
		int temp,reverse_num,rem=0,i=0,num=0;
		while(i<numbers.length){
		      temp=numbers[i];
		      num=temp;
		      reverse_num=0;
		      while(temp!=0){
		         rem=temp%10;
		         temp=temp/10;
		         reverse_num=reverse_num*10+rem;
		      }
		      i++;
		      if(num==reverse_num)
		    	  System.out.print(" "+num);
		}
	 }
	 
	 /**
	  * BubbleSort method for sorting a elements
	 * @param Elements
	 */
	public static<T extends Comparable> T[] bubbleSort(T[] elements) {
		 int i,j;
		 for(i=0;i<elements.length;i++) {
			 for(j=1;j<(elements.length)-i;j++) {
				    if( (elements[j-1]).compareTo(elements[j]) > 0) {
					 T temp=elements[j-1];
					 elements[j-1]=elements[j];
					 elements[j]=temp;
				 }
	 }
		 }
		return elements;
	}
	 
	 /**
	  * BinarySearch Method for Finding a Specific Number
	 * @param Ele
	 * @param key
	 * @param start
	 * @param end
	 * @return 
	 
	 */

	public static <T extends Comparable> int binarySearch(T[] elements,T key,int start,int end){ 
		
		if(start>end)
		return 0;
		
		int mid=(start+end)/2;
				
		if(elements[mid].equals(key))
			return 1;
		else if((elements[mid]).compareTo(key)>0)
			return binarySearch(elements,key,start,mid-1);
		else return binarySearch(elements,key,mid+1,end);

	 }

	/**
	 * Program to Perform Insertion Sort operation
	 * @param Ele
	 * @return 
	 */
	public static<T extends Comparable> T[] insertionSort(T[] elements) {

	int i,hole;

	for(i=1;i<elements.length;i++) {
		T key=elements[i];
		hole=i;
		
		while(hole>0 && elements[hole-1].compareTo(key)>0) {
			elements[hole]=elements[hole-1];
			hole--;
		}
		elements[hole]=key;
	}
	return elements;
	}


	/**
	 * @param money
	 * @param notes
	 * @return
	 * Logic for Vanding Machine Program
	 */
	public static int vendingMachineCal(int money,int notes[]) {
		
		if(money==0 || index>notes.length-1)
			return 0;
		
		if(notes[index]<=money) {
			int rem=money%notes[index];
			int cla=money/notes[index];
			total+=cla;
			money=rem;
			System.out.println(notes[index]+" notes..... "+cla);
		}
		index++;
		return vendingMachineCal(money,notes);
	}
	
	/**
	 * @param decimal
	 * @return
	 * logic to return a decimal to binary
	 */
	public static String toBinary(int decimal) {
		String binary="";
		while(decimal>0) {
			binary=decimal%2+binary;
			decimal=decimal/2;
		}
		return binary;
	}

	/**
	 * @param month
	 * @param day
	 * @param year
	 * Calculating a day of the week
	 */
	public static void dayOfWeek(int month,int day,int year) {
		//String months[] ={"","January","February","march","April","may","June","July","August","september","October","November","December"};
		if(month<1 || month>12) {
			System.out.println("Month is Invalid.....");
			System.exit(0);
		}
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			if(day<1 || day>31) {
				System.out.println("Days invalid......");
				System.exit(0);
			}
		}
		
		if(month==4 || month==6 || month==9 || month==11) {
			if(day<1 || day>30) {
				System.out.println("Days invalid......");
				System.exit(0);
			}
		}
		
		if(month==2) {
			if(day>29 && year%4!=0) {
				System.out.println("Days invalid......");
				System.exit(0);
			}
		}
		
		String[] days= {"Sunday","Monday","Tuesday","Wensday","Thursday","Friday","Saturday"};
		 int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	
		
		
		System.out.print(d+" for "+days[d]);
	}
	
	
	
	/**
	 * @param temperatur
	 * @param check
	 * @return
	 * temperaturConversion logic
	 */
	public static float temperaturConversion(float temperatur, String check){
		if(check=="c"){
		      return (temperatur-32f)*( 5f/9f); 
		}
		else
			{
			return (temperatur*(9f/5f))+32f ;
			}
}

	/**
	 * @param p
	 * @param y
	 * @param r
	 * Logic for calculating monthly payments
	 */
	public static void monthlyPayment(int principalLoan,int years,double interest) {
		int n=12*years;
		double result=interest/(12*100);
		
		double monthlyPayment=(principalLoan*result)/(1-Math.pow(1+interest, (-n)));
		
		System.out.println("The output is...."+monthlyPayment);
	}

	/**
	 * @param c
	 * logic Newton's method
	 */
	public static void sqrt(double number) {
		double epsilon= 1e-15;
		double t=number;
		while(Math.abs(t - number/t) > epsilon*t )
			t=(number/t+t)/2.0;
		
		System.out.println("The Result is........"+t);
	}

	/**
	 * @param values
	 * method to display the elements
	 */
	public static <T> void display(T[] values) {
		for(int i=0;i<values.length;i++)
			System.out.println(values[i]+" ");
		
	}

	/**
	 * @param low
	 * @param high
	 * @return
	 * logic to find the your thinking number
	 */
	public static int search(int low, int high) {
		Scanner scanner=new Scanner(System.in);
        if ((high - low) == 1) return low;
        int mid = low + (high - low) / 2;
        System.out.printf("Is it less than %d?  ", mid);
        System.out.println();
        System.out.println("Enter the true or false to find your number");
        boolean b=scanner.nextBoolean();
        if (b)
        return search(low, mid);
        else
        return search(mid, high);
	}

}
