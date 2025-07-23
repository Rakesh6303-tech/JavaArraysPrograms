package com.programs.Subarrays;
import java.util.Scanner;
public class PairsWithSumLessThanK {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		PairsWithLessThanK(ar,k,n);

	}
	static void PairsWithLessThanK(int ar[],int k,int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]<k)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}


	}
