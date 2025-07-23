package com.programs;
import java.util.Scanner;
public class ArrayMergerThreeArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int ar1 [] = new int [m];
		for(int i= 0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		int n = scan.nextInt();
		int ar2 [] = new int [n];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=scan.nextInt();
		}
		int o = scan.nextInt();
		int ar3 [] = new int [o];
		for(int i=0;i<ar3.length;i++)
		{
			ar3[i]=scan.nextInt();
		}
		int res [] = ArrayMergerThree(ar1,ar2,ar3);
		System.out.println("Merged Array:");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}

	}
	static int [] ArrayMergerThree(int ar1[],int ar2[],int ar3[])
	{
		int j=0;
		int res [] = new int [ar1.length+ar2.length+ar3.length];
		for(int i=0;i<ar1.length;i++)
		{
			res[j++]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			res[j++]=ar2[i];
		}
		for(int i=0;i<ar3.length;i++)
		{
			res[j++]=ar3[i];
		}
		return res;
	}
	

}
