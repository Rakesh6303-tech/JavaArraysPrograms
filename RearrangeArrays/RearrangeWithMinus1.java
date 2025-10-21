package com.RearrangeArrays.com;

import java.util.Scanner;

public class RearrangeWithMinus1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		RearrangeArraysWithMinus1(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	static void RearrangeArraysWithMinus1(int ar [])
	{
		// Picking && Placing Elements
		int i=ar.length-1,j=ar.length-1; // loop starts from Ending
		while(i>=0)  
		{
			if(ar[i]==-1)
			{
				
				i--;
			}
			else
			{
				ar[j]=ar[i];
				i--;
				j--;
			}
		}
		while(j>=0)
		{
			ar[j]=-1;
			j--;
		}
	}

}
