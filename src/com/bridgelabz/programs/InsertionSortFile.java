package com.bridgelabz.programs;

import java.io.*;
import com.bridgelabz.utility.utility;

public class InsertionSortFile {

	public static void main(String[] args) throws Exception {
		File file = new File("/home/bridgeit/eclipse-workspace/AlogorithmPrograms/src/com/bridgelabz/programs/insertionsort.txt");
		   String word="";
	    BufferedReader bufferReader=new BufferedReader(new FileReader(file));
	    
	    word=bufferReader.readLine();

	    bufferReader.close();
	    System.out.println("Sorted Elements are..............");
	    String[] str=word.trim().split(" ");
	    String arraySorted[]=utility.insertionSort(str);
	    
	    for(int i=0;i<arraySorted.length;i++) {
	   System.out.println(arraySorted[i]);
	    }
}
}
