package com.programs;

import java.util.Scanner;

public class ArrayMerger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int ar1 [] = new int [m];
		for(int i= 0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		int n = scan.nextInt();
		int ar2 [] = new int [n];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=scan.nextInt();
		}
		ArrayMerger(ar1,ar2);
	}
	static void ArrayMerger(int ar1 [],int ar2 [])
	{
		// Easy Trick
//		for(int num:ar1)
//		{
//			System.out.print(num+" ");
//		}
//		for(int num:ar2)
//		{
//			System.out.print(num+" ");
//		}
		int [] merged = new int[ar1.length+ar2.length];
		
		for(int i=0;i<ar1.length;i++)
		{
			// Array index element store into the merged array Index
			merged[i]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			merged[ar1.length+i]=ar2[i];
		}
		// Print Merged Array -->Enchanced Loop
		for(int num:merged)
		{
			System.out.print(num+" ");
		}
	//	System.out.println();
	}

}

