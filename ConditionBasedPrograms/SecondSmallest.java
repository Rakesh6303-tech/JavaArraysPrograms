package ConditionPrograms;
import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		SecondSmallestElement(ar);
	}
	static void SecondSmallestElement(int ar [])
	{
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<firstSmallest)
			{
				secondSmallest = firstSmallest;
				firstSmallest = ar[i];
			}
			else if(ar[i]<secondSmallest && ar[i]!=firstSmallest)
			{
				secondSmallest = ar[i];
			}
		}
		System.out.println(secondSmallest);
	}

}
