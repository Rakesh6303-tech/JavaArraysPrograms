package com.RearrangeArrays.com;
import java.util.*;
public class RearrangeWithNegativeStarting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int b [] = RearrangeWithNegativeStarting(ar);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	static int [] RearrangeWithNegativeStarting(int ar [])
	{
		int b [] = new int[ar.length];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				b[j]=ar[i];
				j++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>=0)
			{
				b[j]=ar[i];
				j++;
			}
		}
		return b;
	}

}
