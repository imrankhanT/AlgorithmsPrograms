package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class BinarySearchListFile {

	public static void main(String[] args) {
		try {
			String key;
			String word=null;
			Scanner scanner=new Scanner(System.in);
			File file = new File("/home/bridgeit/eclipse-workspace/AlogorithmPrograms/src/com/bridgelabz/programs/im.txt");
		   
		    if(file.exists()) {
		    if(file.canRead()) {
		    BufferedReader bufferReader=new BufferedReader(new FileReader(file));
		     
		    
		    word=bufferReader.readLine();

		    bufferReader.close();
		    String[] str=word.trim().split(",");
		  
		 
		    String[] string=utility.bubbleSort(str);
		    utility.display(string);
		    System.out.println("Enter the Key To search....");
		    key=scanner.nextLine();
		    scanner.close();
		    if(utility.binarySearch(string,key,0,string.length-1)>0) {
		    System.out.println("Element is found......");
		    													}
		    else  {
			System.out.println("Not Found......");
		    	  }
		    	               }else {
		    		System.out.println("file cant read");
		    	                      }
		                       }
		    else {
		    System.out.println("file not found");
		           }
		   }catch(Exception e) {
		   e.printStackTrace();
	                           }

	}

}
