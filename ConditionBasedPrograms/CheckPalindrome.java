 package com.rakhi;
import java.util.*;
public class CheckPalindromeNumber {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		checkpalindrome(n);	
	}
	static void checkpalindrome(int n)
	{
		
		int originalnumber = n;
		int reversednumber = 0;
		while(n!=0)  // or while(n>0)
		{
			// Extract the Last Digit
			int digit = n%10;
			// Do Sum Calculation
			reversednumber = reversednumber*10+digit;
			// Remove the Last Digit
			n /=  10;
		}
		// Checking Whether Palindrome or Not
		if(originalnumber == reversednumber)
		{
			System.out.println(originalnumber + " is a palindrome number");
		}
		else
		{
			System.out.println(originalnumber + " is not a palindrome number");
		}
	}
}
