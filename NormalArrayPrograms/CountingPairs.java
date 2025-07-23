package com.programs;
import java.util.Scanner;
public class CountingPairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		CountingPairs(ar,n);
	}
	static void CountingPairs(int ar [],int n)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
