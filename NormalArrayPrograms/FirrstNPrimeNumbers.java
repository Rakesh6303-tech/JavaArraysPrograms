Input : 8
   Output : 2 3 5 7 11 13 17 19 
import java.util.*;
public class NPrimeNumbers{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    FirstNPrimeNumbers(n);
  }
  static void FirstNPrimeNumbers(int n){
    int count=0;
    int num = 2;
    while(count<n){
      if(isPrime(num))
      {
        System.out.print(num +" ");
        count++;
      }
      num++;
    }
  }
  static boolean isPrime(int n)
  {
    if(n<2)return false;
    for(int i=2;i*i<=n;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  
}
