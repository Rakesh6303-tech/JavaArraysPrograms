package com.programs;
import java.util.Scanner;
public class OddIndexElements {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		oddIndexele(ar,n);
	}
	static void oddIndexele(int ar [],int n) {
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(ar[i]+" ");
			}
		}
	}

}
