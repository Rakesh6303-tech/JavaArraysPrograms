package com.programs;
import java.util.Scanner;
public class OccurenceOfLargestElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int ar []= new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		OccuOfLargestEle(ar,n);
	}
	static void OccuOfLargestEle(int ar[],int n)
	{
		int max=ar[0];
		int count=1;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
				count=1;
			}
			else if(ar[i]==max)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
