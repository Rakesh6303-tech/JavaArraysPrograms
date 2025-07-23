package com.programs.Subarrays;
import java.util.*;
public class SubarrayReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		ReverseSubArrays(ar,n);
	}
	static void ReverseSubArrays(int ar [],int n)
	{
		for(int size = ar.length;size>=0;size--)
		{
			for(int i=0;i<=ar.length-size;i++)
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
