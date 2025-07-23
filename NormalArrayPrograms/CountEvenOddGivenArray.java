write a program to  count even and odd numbers in given array
  
  import java.util.*;
  public class demo{
	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9};
		int evencount=0,oddcount=0;
		for(int a:ar) {
			if(a%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("EvenNumbers count"+":"+evencount);
		System.out.println("OddNumbers count" +":"+oddcount);
	}
  }
