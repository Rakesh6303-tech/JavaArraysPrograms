package com.tap.interview;
import java.util.*;
public class Fibonacci Series {
	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		// Accepts Input & a=0, b=1, & next value will be stored
		int n = scan.nextInt(),a=0,b=1,next;
		
		for(int i=0;i<n;i++)
		{
			// 0+1 will be stored in the next
			next=a+b;
			System.out.print(a+" ");
			// 'b' value is stored in a
			a=b;
			// 'next' value is stored in b
			b=next;
			
		}
	}

}


