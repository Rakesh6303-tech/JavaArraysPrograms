package com.programs.Subarrays;

import java.util.Scanner;

public class SumofSubArrayBasedOnK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		Sumofsubarrybasedonkvalue(ar,k);
	}
	static void Sumofsubarrybasedonkvalue(int ar [],int k)
	{

		for(int i=0;i<=ar.length-k;i++)
		{
			int sum = 0;
			for(int j=i;j<i+k;j++)
			{
				sum = sum+ar[j];
			}
			System.out.println(sum);
		
		}
		
	}

}
