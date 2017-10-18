package com.bridgelabz.programs;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number Size of Elements....");
		n=s.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the Array Elements....");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		mergesort(a);
		printArray(a);
	}
	private static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
	public static void mergesort(int a[]) {
		int n=a.length;
		
		if(n<2)
		return;
		
		int mid=n/2;
		
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<n;i++)
			right[i-mid]=a[i];
		
		mergesort(left);
		mergesort(right);
		merge(left,right,a);
	}
	public static void merge(int[] left,int[] right,int[] a) {
		
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
			}else if(right[j]<left[i]){
				a[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			a[k++]=left[i];
			i++;
		}
		while(j<right.length) {
			a[k++]=right[j];
			j++;
		}
	}
}
