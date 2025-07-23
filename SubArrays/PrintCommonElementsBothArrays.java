package com.programs.Subarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintCommonElementsBothArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int ar1 [] = new int [m];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		int n = scan.nextInt();
		int ar2 [] = new int [n];
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
		}
//		Arrays.sort(ar1);
//		Arrays.sort(ar2);
		CommonRepeatedElementsBothArrays(ar1,ar2);
	}
	static void CommonRepeatedElementsBothArrays(int ar1[],int ar2[])
	{
//		boolean value =false;
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length)
		{
			if(ar1[i]==ar2[j])
			{
				System.out.print(ar1[i]+" ");
//				value=true;
				i++;
				j++;
			}
			else if(ar1[i]>ar2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
	}

}
