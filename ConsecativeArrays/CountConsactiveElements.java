Input : 10
     v : 5 12 13 14 9 2 3 4 5 8
output :  
1
3
1
4
1

 
public class CountConsacativeElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar [] = new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		CountCElements(ar);
	}
	static void CountCElements(int ar [])
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				count++;
			}
			else {
				System.out.print(count);
				System.out.println();
				count=1;
			}
		}
		System.out.println(count);
	}

}
