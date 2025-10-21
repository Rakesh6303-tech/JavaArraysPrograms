package SubArrays;

import java.util.Scanner;

public class LongestSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		LongestSubArray(k,ar);
	}
	static void LongestSubArray(int k, int ar [])
	{
		int maxlen = 0; // stores maximum len of subarray found so far
		int startIndex = -1; // stores starting index of longest subarray
		int EndIndex = -1;   // stores ending index of longest subarray
		for(int i=0;i<ar.length;i++)
		{
			int sum =0; 
			for(int j=i;j<ar.length;j++)
			{
				sum += ar[j];
				// check if current subarray sum equal k
				if(sum==k) {
					int currentLength = j-i+1; // Calculate current subarray length
					if(currentLength>maxlen) {
						maxlen = currentLength; // update max length
						startIndex = i;         // update start index
						EndIndex = j;           // update end index
						
					}
				}
			}
		}

        // After all loops, check if any subarray was found
		if(maxlen==0)
		{
			System.out.println("No Subarray found");
		}
		else {
			// Print the elements of the longest subarray
			for(int i=startIndex;i<=EndIndex;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}

}
