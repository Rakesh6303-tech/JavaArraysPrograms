package com.programs.Subarrays;

import java.util.Scanner;

public class EvenPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		EvenPairs(ar,n);
	}
	static void EvenPairs(int ar [],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]%2==0 && ar[j]%2==0)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
