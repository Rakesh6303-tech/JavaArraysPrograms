 package com.RearrangeArrays.com;
import java.util.*;
public class RearrangeWithPostiveIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int b [] = RearrangeWithPostivestart(ar);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	static int [] RearrangeWithPostivestart(int ar [])
	{
		int b [] = new int [ar.length];
		int j=0;
		for(int i=0;i<ar.length;i++) // Postive array Traversal
		{
			if(ar[i]>=0)
			{
				b[j]=ar[i];
				j++;
			}
		}
		for(int i=0;i<ar.length;i++)// Negative values Traversal
		{
			if(ar[i]<0)
			{
				b[j]=ar[i];
				j++;
			}
		}
		
		return b;
	}

}
