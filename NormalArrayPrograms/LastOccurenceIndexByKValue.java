 package com.programs;

import java.util.Scanner;

public class LastOccurenceIndexFinderByKvalue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		System.out.println(LOccIFBK(ar,n,k));
	}
	static int LOccIFBK(int ar[],int n,int k)
	{
		for(int i=ar.length-1;i>=0;i--) // Reverse the Loop
		{
			if(ar[i]==k)
			{
				return i;
			}
		}
		return -1;// value isnt present
	}

}
