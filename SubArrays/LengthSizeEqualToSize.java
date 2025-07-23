package com.programs.Subarrays;

import java.util.Scanner;

public class LengthOfSizeIsEqualToSize {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int size=scan.nextInt();
		int sumvalue=scan.nextInt();
		LengthOfSizeEqualToSize(ar,n,size,sumvalue);
	}
static void LengthOfSizeEqualToSize(int ar[],int size,int sumvalue,int n)
{
	for(int i=0;i<=ar.length-size;i++)
	{
		int sum=0;
		for(int j=i;j<i+size;j++)
		{
			sum = sum+ar[j];
		}
		if(sum==sumvalue)
		{
			for(int j=i;j<i+size;j++)
			{
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
}
}
