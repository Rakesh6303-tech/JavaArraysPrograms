package com.RearrangeArrays.com;
import java.util.Scanner;
public class RearrangeArraysToLastZeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		RearrangeArrayToLastZero(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	static void RearrangeArrayToLastZero(int ar [])
	{
		int i=0,j=0;
		while(i<ar.length) // Loop Starting we use i<ar.length
		{
			if(ar[i]==0)  // or print -1 at the End of The array Logic :- if(ar[i]==-1)
			{
				i++;
			}
			else
			{
				ar[j]=ar[i];
				i++;
				j++;
			}
		}
		while(j<ar.length)
		{
			ar[j]=0;
			j++;
		}
	}

}
