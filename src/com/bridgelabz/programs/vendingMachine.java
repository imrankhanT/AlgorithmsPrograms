package com.bridgelabz.programs;

import java.util.*;

import com.bridgelabz.utility.utility;

public class vendingMachine {

	public static void main(String[] args) {
		int money;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Money.....");
		money=scanner.nextInt();
		int notes[]= {1000,500,100,50,10,5,2,1};
		
		utility.vendingMachineCal(money,notes);
		System.out.println("Total number of notes to change......"+utility.total);
		scanner.close();
	}
}
