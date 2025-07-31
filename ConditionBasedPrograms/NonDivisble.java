n =5 
k =3  
v = 1 2 3 4 5
output = 1 2 4 5
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
    int k = scan.nextInt();
    NonDivisble(ar,k);
    scan.close();
  }
  static void NonDivisble(int ar [],int k)
  {
    boolean value = false;
    for(int i=0;i<ar.length;i++)
    {
      if(ar[i]%k!=0)
      {
        System.out.print(ar[i]+" ");
        value = true;
      }
    }
    if(!value)
    {
      System.out.print("No elements found");
    }
  }
}
