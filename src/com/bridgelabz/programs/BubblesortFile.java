package com.bridgelabz.programs;

import java.io.*;
import com.bridgelabz.utility.utility;

public class BubblesortFile {

	public static void main(String[] args) throws Exception {
		File file = new File("/home/bridgeit/eclipse-workspace/AlogorithmPrograms/src/com/bridgelabz/programs/bubblesortfile.txt");
		   String word=null;
	    BufferedReader bufferReader=new BufferedReader(new FileReader(file));
	     
	    
	    word=bufferReader.readLine();

	    bufferReader.close();
	    System.out.println("Sorted Elements are......");
	    String[] str=word.trim().split(" ");
	    String arraySorted[]=utility.bubbleSort(str);
	    
	    for(int i=0;i<arraySorted.length;i++) {
	   System.out.println(arraySorted[i]);
	    }
	}

}
