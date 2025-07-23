package com.programs.Subarrays;
import java.util.Scanner;
public class ProductPairs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int p = scan.nextInt();
		ProductPairs(ar,n,p);
	}
	static void ProductPairs(int ar [],int n,int p)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]*ar[j]==p)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

	}

