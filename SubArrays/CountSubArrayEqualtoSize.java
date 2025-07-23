package com.programs.Subarrays;

import java.util.Scanner;

public class Countsubarrayequaltosize {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int subarraysize = scan.nextInt();
		int sumvalue = scan.nextInt();
		Countsubarrayequaltosize(ar,subarraysize,sumvalue);
	}
	static void Countsubarrayequaltosize(int ar[],int subarraysize,int  sumvalue)
	{
		int count=0;
		for(int i=0;i<=ar.length-subarraysize;i++)
		{
			int sum=0;
			for(int j=i;j<i+subarraysize;j++)
			{
				sum = sum+ar[j];
				
			}
			if(sum==sumvalue)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
