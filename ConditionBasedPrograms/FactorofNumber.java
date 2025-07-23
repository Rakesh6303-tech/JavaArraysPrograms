package com.rakhi;
import java.util.*;
public class FactorsOfNumber {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		FactorOfNumber(n);
	}
	static void FactorOfNumber(int n)
	{
		boolean value = true;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				value=true;
			}
		}
		if(!value)
		{
			System.out.println("No Factors Found");
		}
	}

}
