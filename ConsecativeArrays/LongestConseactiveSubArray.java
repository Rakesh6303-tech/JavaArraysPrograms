input :  10
5 12 13 14 9 2 3 4 5 8
 output : 4
package ConsecativeArray;
import java.util.*;
public class LongestConsecativeSubarrayLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		LongestConsecutiveSubarray(ar);
	}
	static void LongestConsecutiveSubarray(int ar [])
	{
		int count=1,max=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				count++;
			}
			else {
				if(count>max)
				{
					max=count;	
				}
				count=1;
			}
		}
		// For the Last Value
		if(count>max)
		{
			max=count;
		}
		System.out.println(max);
	}
	

}
