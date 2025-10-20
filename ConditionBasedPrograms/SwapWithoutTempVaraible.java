import java.util.*;
public class Demo{
  public static void main (String args []){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();  // 7
    int b = scan.nextInt();  // 5
    a = a + b; //    7 + 5 = 12
    b = a - b; //   12 - 5 = 7
    a = a - b;  //   12 - 7 = 5
    System.out.print(a);  // OP--> 5
    System.out.print(b);  // OP--> 7
