package com.RearrangeArrays.com;

import java.util.Scanner;

public class RerrangeArrayWith0AtBeginging {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		int ar []= new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		RearrangeWithBeginZero(ar,n);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	static void RearrangeWithBeginZero(int ar [],int n)
	{
		int i=ar.length-1,j=ar.length-1;
		while(i>=0)
		{
			if(ar[i]==0)
			{
				i--;
			}
			else
			{
				ar[j]=ar[i];
				i--;
				j--;
			}
		}
		while(j>=0)
		{
			ar[j]=0;
			j--;
		}
	}

}
