package com.rakhi;
import java.util.*;
public class SumofElements {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		printsumElements(n);
	}
	static void printsumElements(int n)
	{
		int sum=0; // to store the sum value
		while(n!=0) // or while(n>0) as long as condtion True
		{
			//int rem = n%10; // Remove last digit & store in rem
			sum = sum + n%10;   //  Remove last digit & store in sum
			n = n/10;    // totally remove the last number from n 
		}
		System.out.println(sum); // print sum
	}

}
