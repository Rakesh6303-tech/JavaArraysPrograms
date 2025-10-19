package ArrangingArrays;

import java.util.Scanner;

public class PrintUniqueElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		PrintUniqueElements(ar);
	}
	static void PrintUniqueElements(int ar[])
	{
		int count=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1]) {
				count++;
			}
			else {
				if(count==1)
				{
					System.out.println(ar[i]);
				}
				count=1;
			}
		}
		// For Last Value
		if(count==1)
		{
			System.out.println(ar[ar.length-1]);
		}
		
	}

}
