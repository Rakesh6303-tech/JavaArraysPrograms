package ConditionPrograms;
import java.util.*;
public class Swappingelements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		SwapEle(ar);
	}
	static void SwapEle(int ar [])
	{
		for(int i = 0; i < ar.length - 1; i += 2) {  // Loop through the array in steps of 2
		    int temp = ar[i];                        // Step 1: Store the current element at index i in a temporary variable
		    ar[i] = ar[i + 1];                       // Step 2: Replace the current element with the next element (swap)
		    ar[i + 1] = temp;                        // Step 3: Put the original element (stored in temp) into the next index
		} 
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] +" ");
		}
	}

}
