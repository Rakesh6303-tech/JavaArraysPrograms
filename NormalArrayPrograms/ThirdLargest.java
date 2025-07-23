package com.rakhi;
import java.util.Scanner;
public class ThirdLargest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar []  = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int res = ThirdLargest(ar,n);
		System.out.println(res);
	}
	static int ThirdLargest(int ar [],int n)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int num:ar)
		{
			if(num>max1)
			{
				max3 = max2;
				max2 = max1;
				max1 = num;
			}
			else if(num > max2 && num!=max1)
			{
				max3=max2;
				max2=num;
			}
			else if(num>max3 && num!=max1 && num!=max2)
			{
				max3=num;
			}
		}
		return max3;
	}

}
