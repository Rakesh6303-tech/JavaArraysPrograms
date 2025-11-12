Input : 6
1 2 5 3 6 7
  Output : 3
import java.util.*;
public class Demo{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ar [] = new int [n];
    for(int i=0;i<ar.length;i++)
    {
      ar[i]=scan.nextInt();
    }
    MissingNumber(ar);
  }
  static void MissingNumber(int ar [])
  {
    int max = ar[0];
    {
      for(int i=0;i<ar.length;i++)
      {
        if(ar[i]>max)
        {
          max=ar[i];
        }
      }
      int total = max*(max+1)/2;
      int sum = 0;
      for(int v:ar)
      {
        sum+=v;
      }
      System.out.print(total-sum);
    }
  }
}
