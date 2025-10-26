Input : n = 10
       v =  5 12 13 14 9 2 3 4 5 8
output : 
5
12 13 14
9
2 3 4 5
8
package ConsecativeArray;
import java.util.*;
public class PrintConsectiveElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		ConsElements(ar);
	}
	static void ConsElements(int ar [])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				System.out.print(ar[i]+" ");
			}
			else {
				System.out.print(ar[i]);
				System.out.println();
			}
		}
		// last Element
		System.out.println(ar[ar.length-1]);
	}

}
