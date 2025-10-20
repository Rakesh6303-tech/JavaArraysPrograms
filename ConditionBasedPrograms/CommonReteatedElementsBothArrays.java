package ArrayPrograms;
import java.util.*;
public class RepeteadCommonElementsBothArrays {

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
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		CommonReteatedElements(ar1,ar2);
	}
	static void CommonReteatedElements(int ar1[],int ar2[])
	{
		int a = 0; // To Traversal for ar1
		int b = 0; // To Traversal for ar2
		while(a<ar1.length && b<ar2.length)
		{
			if(ar1[a]==ar2[b])
			{
				System.out.print(ar1[a] +" ");
				a++;  // Moves to ar1 element
				b++;  // Moves to ar2 element
			}
			else if(ar1[a]>ar2[b])
			{
				b++;  // Moves to ar2 element
			}
			else
			{
				a++;  // Moves to ar1 element
			}
		}
	}

}
