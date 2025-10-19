package ConditionPrograms;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n-1];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		MissingNumber(ar,n);
	}
	static void MissingNumber(int ar [],int n)
	{
		int exceptedSum = n*(n+1)/2;
		int TotalSum=0;
		for(int num:ar)
		{
			TotalSum += num;
		}
		System.out.println(exceptedSum-TotalSum);
	}

}
