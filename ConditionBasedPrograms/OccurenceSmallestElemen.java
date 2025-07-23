package com.programs;

import java.util.Scanner;

public class OccurenceOfSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar []= new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		CountOccrenceSmallElmnt(ar,n);
	}
	static void CountOccrenceSmallElmnt(int ar [],int n)
	{
		int min = ar[0];
		int count=1;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
				count=1;
			}
			else if(ar[i]==min)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
