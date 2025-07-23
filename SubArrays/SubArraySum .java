package com.programs.Subarrays;
import java.util.*;
public class SubArraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			SubArraySum(ar,k,i);
		}
	}
	static void SubArraySum(int ar[],int k,int size)
	{
		for(int i=0;i<=ar.length-size;i++)
		{
			int sum=0;
			for(int j=i;j<i+size;j++)
			{
				sum = sum + ar[j];
			}
			if(sum==k)
			{
				for(int j=i;j<i+size;j++)
				{
					System.out.println(ar[j] +" ");
				}
				System.out.println();
			}
		}
	}

}
