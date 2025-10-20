package ConditionPrograms;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		DescendingOrder(ar);
	}
	static void AscendingOrder(int ar [])
	{ 
		for(int i=0;i<ar.length;i++)   // Outer Loop starts from 0 after to 1 like that
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])  // For Ascending order
				{
					int temp = ar[i];
					ar[i]= ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
