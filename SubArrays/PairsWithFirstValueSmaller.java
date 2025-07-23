package com.programs.Subarrays;

import java.util.Scanner;

public class PairsWithFirstValueSmaller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		pairswithfirstsmaller(ar,n);
	}
	static void pairswithfirstsmaller(int ar [],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
