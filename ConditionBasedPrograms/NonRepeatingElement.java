 package com.programs;
import java.util.Arrays;
import java.util.Scanner;
public class PrintNonRepetingEle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		Arrays.sort(ar);
		PrintNonRepeatingEle(ar,n);
	}
	static void PrintNonRepeatingEle(int ar [],int n)
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				if(count==1)
				{
					System.out.println(ar[i]+" ");
				}
				count=1;
			}
		}
		if(count==1)
		{
			System.out.println(ar[ar.length-1]);
		}
	}
}
