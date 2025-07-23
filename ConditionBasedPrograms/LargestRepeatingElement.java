package com.rakhi;
import java.util.*;
public class LargestRepeatingEleme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		LargestRepeatingEle(ar,n);
	}
	static void LargestRepeatingEle(int ar [],int n)
	{
		boolean value = false;
		for(int i=ar.length-1;i>=1;i--)
		{
			if(ar[i]==ar[i-1])
			{
				System.out.println(ar[i]+" ");
				value = true;
				break;
			}
		}
		if(!value)
		{
			System.out.println("No Repeating Largest Elements found");
		}
		
	}
	
}
