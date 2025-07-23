package com.programs.Subarrays;

import java.util.Scanner;

public class SubarraysBasedOnKValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar []= new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		SubArraysBasedOnKValue(ar,k);
	}
	static void SubArraysBasedOnKValue(int ar [],int k)
	{
		for(int i=0;i<=ar.length-k;i++)
		{
			for(int j=i;j<i+k;j++)  // printing sub arrays
			{
				System.out.print(ar[j]+" "); // one element printing
			}
			System.out.println(); // printing after every sub array goes to next line
		}
	}

}
