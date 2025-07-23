package com.programs;
import java.util.*;
public class SecondLargestOccurence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar []  = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		secondlargest(ar);
	}
	static void secondlargest(int ar []) {
		int count=1;
		int large = 0, second=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>large)
			{
				second = large;
				large = ar[i];
			}
			else if(ar[i]>second && ar[i]!=large)
			{
				second=ar[i];
				count++;
			}
		}
		System.out.println(second +"-"+count);
	}

}
