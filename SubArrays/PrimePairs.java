package com.programs.Subarrays;
import java.util.Scanner;
public class PrimePairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  n = scan.nextInt();
		int ar [] = new int  [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
			
		}
		PrimePairs(ar,n);
	}
	
	static void PrimePairs(int ar [],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(isprime(ar[i]) && isprime(ar[j]))
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	static boolean isprime(int n) // Prime Condition
	{
		if(n<2)return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
