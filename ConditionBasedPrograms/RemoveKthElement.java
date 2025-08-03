/*
Write a program that removes every kth element from an integer array and prints the modified array
n = 10
v = 1 2 3 4 5 6 7 8 9 10
k = 3

Sample Output 
1 2 4 5 7 8 10
*/

import java.util.*;
public class Demo{
  public static void main(String args [] ){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int ar [] = new int [n];
    for(int i=0;i<ar.length;i++)
      {
        ar[i] = scan.nextInt();
      }
    int k = scan.nextInt();
    RemoveKthElemetn(ar,k);
  }
static void RemoveKthElemnt(int ar [], int k)
  {
    for(int i=0;i<ar.length;i++)
      {
        if(ar[i]%k!=0)
          System.out.print(ar[i]+" ");
      }
  }
}
