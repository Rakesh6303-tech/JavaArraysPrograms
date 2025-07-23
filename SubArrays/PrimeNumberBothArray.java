package com.programs.Subarrays;

import java.util.Scanner;

public class CommonPrimeNumberBothArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar1 [] = new int [n];
		int ar2 [] = new int [n];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
		}
		CommonPrimeElementsBothArrays(ar1,ar2,n);
	}
	static void CommonPrimeElementsBothArrays(int []ar1,int []ar2,int n)
	{
		boolean value = false;
		for(int i=0;i<ar1.length;i++)
		{
			if(checkprime(ar1[i]))
			{
				for(int j=0;j<ar2.length;j++)
				{
					if(ar1[i]==ar2[j])
					{
						System.out.println(ar1[i]+" ");
						value=true;
						break;
					}
				}
			}
		}
		if(!value)
		{
			System.out.println("No Prime Numbers are Found");
		}
	}
	static boolean checkprime(int n)
	{
		if(n<2)return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
