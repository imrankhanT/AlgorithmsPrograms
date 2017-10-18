package com.bridgelabz.programs;

import java.util.*;

import com.bridgelabz.utility.utility;

public class swapNibble {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int decimal;
		System.out.println("Enter the Number......");
		decimal=scanner.nextInt();
		
		String binaryNum=utility.toBinary(decimal);
		
		double sum=0.0;
		int k=0;
		System.out.println(decimal + " in binary representation is........: " + binaryNum);
		char arr [] = binaryNum.toCharArray();
		
		while(binaryNum.length()!=8)
		{
			binaryNum = "0"+binaryNum;
		}
		int j=4;
		char arr1 [] = binaryNum.toCharArray();
		for (int i=0;i<arr1.length/2;i++)
		{
			char temp1 = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp1;
			j++;
		}
		System.out.print("After Swapping nibble................ : ");
		System.out.println(arr1);
		int res =  (int) toDecimal(arr1,0);
		String binaryNum_Decimal=utility.toBinary((int)res);
		char ch[]=binaryNum_Decimal.toCharArray();
		System.out.println("Decimal form after swapping nibbles.................... : "+(int)(res));
		int decimal_result=(int) toDecimal(ch,res);
		System.out.println(decimal_result);
		if(decimal_result==res) {
			System.out.println("Its a power of two");
		}else {
			System.out.println("its is not a power of two....");
		}
		scanner.close();
		
	}
	private static double toDecimal(char[] arr, double sum) 
	{
		int k=0; sum=0;
		String powerTwo="";
		for (int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]=='1')
			{
				sum=sum+(Math.pow(2, k));
			}
			k++;
			
		}
		return sum;
		
	}
	
}
