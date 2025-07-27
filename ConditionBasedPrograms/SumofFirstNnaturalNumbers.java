 program sum of first natural numbers
   Ex :  5
        output : 15
package com.tap.interview;
import java.util.*;
public class sum{
	public static void main(String args[ ])
	{
		int n = new Scanner(System.in).nextInt();
		int sum = n*(n+1)/2;
		System.out.println(sum);
	}
}



