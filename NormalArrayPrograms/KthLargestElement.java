package ConditionPrograms;
import java.util.*;
public class KthLARgestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		Arrays.sort(ar);
		FindKthLargest(ar,k,n);
	}
	static void FindKthLargest(int ar [],int k,int n)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[n-k]);
			break;
		}
	}

}
