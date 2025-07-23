package com.rakhi;
import java.util.*;
public class NPrimeNumbers {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		Nprimenumbers(n);
	}
	// Printing N numbers Prime Numbers
	static void Nprimenumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(isprime(i))
			{
				System.out.println(i);
			}
		}
	}
	// Checking Each Number Prime
	static boolean isprime(int n)
	{
		if(n<2) // below 2 values are not prime so it is false;
		{
			return false;
		}
		// check for Divisibilty from 2 to square root of number
		for(int i=2;i<=Math.sqrt(n);i++) 
		{
			if(n%i==0) // If Divisble by any, It's Not Prime
			{
				return false; // false
			}
		}
		return true;  // True
	}

}
