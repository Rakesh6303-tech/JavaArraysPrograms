package com.programs.Subarrays;

import java.util.Scanner;
public class PairsWithsubstraction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k =scan.nextInt();
		PairsWithSubstraction(ar,k,n);
	}
	static void PairsWithSubstraction(int ar [],int k,int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]-ar[j]==k || ar[j]-ar[i]==k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
