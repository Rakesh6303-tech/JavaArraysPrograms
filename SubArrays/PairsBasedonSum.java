package com.programs;
import java.util.Scanner;
public class PrintPairsBasedOnSumValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar []= new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int sumvalue=scan.nextInt();
		PrintPairsBasedOnSumValue(ar,sumvalue);
	}
	static void PrintPairsBasedOnSumValue(int ar [],int sumvalue)
	{
		for(int size=1;size<=ar.length;size++)
		{
			for(int i=0;i<=ar.length;i++)
			{
				int s=0;
				for(int j=i;j<i+size;j++)
				{
					s += ar[j];
				}
				if(s==sumvalue)
				{
					for(int j=i;j<i+size;j++)
					{
						System.out.print(ar[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}

}
