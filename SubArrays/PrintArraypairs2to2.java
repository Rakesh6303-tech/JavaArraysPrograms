package com.programs.Subarrays;
import java.util.Scanner;
public class PrintArraypairs2to2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		Arraypairs(ar,n);
	}
	static void Arraypairs(int ar [],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
	}

}
