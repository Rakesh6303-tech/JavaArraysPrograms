package ArrangingArrays;
import java.util.*;
public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar1 [] = new int [n];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int ar2 [] = new int [m];
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
		}
		int c [] = mergedarray(ar1,ar2);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] +" ");
		}
	}
	static int [] mergedarray(int ar1[],int ar2[])
	{
		int k=0;  // To Traversal
		int [] c = new int[ar1.length + ar2.length];
		for(int i=0;i<ar1.length;i++) // array 1
		{
			c[k++]=ar1[i]; // Store in c & k moves to next
		}
		for(int j=0;j<ar2.length;j++) // array 2
		{
			c[k++]=ar2[j]; // Store in c & k moves to next
		}
		return c;
	}

}
