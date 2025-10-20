package SubArrays;

import java.util.Scanner;

public class SubArraySumEqualK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		SubArraySumk(ar,k);
	}
	static void SubArraySumk(int ar [],int k)
	{
		for(int i=0;i<ar.length;i++)
		{
			int sum =0;
			for(int j=i;j<ar.length;j++)
			{
				sum = sum + ar[j];
				if(sum==k)
				{
					for(int m=i;m<=j;m++)
					{
						System.out.print(ar[m]+" ");
					}
					System.out.println();
				}
			}
		}
	}

}
