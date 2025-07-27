package com.tap.interview;
import java.util.*;
public class FirstLSL{
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		Elements(ar);
	}
	static void Elements(int ar [])
	{
		int largest =0;
		int second = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>largest) {
				second=largest;
				largest=ar[i];
			}
			else if(ar[i]>second && ar[i]!=largest)
			{
				second = ar[i];
			}
		}
		System.out.println(largest);
		System.out.println(second);
	}

}


