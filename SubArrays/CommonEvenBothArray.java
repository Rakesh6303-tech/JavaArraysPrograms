package com.programs.Subarrays;

import java.util.Scanner;

public class CommonEvenElemBothArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar1 [] = new int [n];
		int ar2 [] = new int [n];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
		}
		CommonEvenElementsBothArrays(ar1,ar2,n);
	}
	static void CommonEvenElementsBothArrays(int ar1 [],int ar2 [],int n)
	{
		boolean value = false;
		int count=0;
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]%2==0)
			{
				for(int j=0;j<ar2.length;j++)
				{
					if(ar1[i]==ar2[j])
					{
						System.out.print(ar1[i]+" ");
						value=true;
						count++;
						break;
					}
				}
			}
		}
		if(!value)
		{
			System.out.println("No Odd Elements are Found");
		}
			
	}

	}


