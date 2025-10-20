package ArrayPrograms;
import java.util.*;

public class CommonRepetatingOddEleBothArrays {

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
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=scan.nextInt();
		}
		CROEBA(ar1,ar2);
	}
	static void CROEBA(int ar1[], int ar2[])
	{
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]%2==1)
			{
				for(int j=0;j<ar2.length;j++)
				{
					if(ar1[i]==ar2[j])
					{
						System.out.print(ar1[i] +" ");
					}
				}
			}
		}
	}

}
