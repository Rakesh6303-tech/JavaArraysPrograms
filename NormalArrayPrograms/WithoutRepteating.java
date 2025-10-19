package ArrangingArrays;
import java.util.*;
public class PrintWithoutRepeating {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		PrintWithoutRepteaing(ar);

	}
	static void PrintWithoutRepteaing(int ar [])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				System.out.println(ar[i]+" ");
			}
		}
		System.out.println(ar[ar.length-1]);
	}

}
