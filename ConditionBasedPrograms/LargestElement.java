package com.rakhi;
import java.util.Scanner;
public class LargestElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		Largestele(ar,n);
	}
	static void Largestele(int ar[],int n)
	{
		int max = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
