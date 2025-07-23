package com.rakhi;
import java.util.*;
public class PrintEvenNumbers {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		printevenumbers(n);
	}
	static void printevenumbers(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
