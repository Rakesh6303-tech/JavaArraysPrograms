package ConsecativeArray;

import java.util.Scanner;

public class LongestPrimeSubArrayLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]=new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		primelength(ar);
	}
	static void primelength(int ar[])
	{
		int count=0,max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(isprime(ar[i]))
			{
				count++;
				if(count>max)
				{
					max=count;
				}
			}
			else {
				count=0;
			}
		}
		System.out.println(max);
	}
	static boolean isprime(int n)
	{
		if(n<=1)return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
