package ConditionPrograms;
import java.util.*;

public class ThirdLargest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create Scanner object for user input
        int n = scan.nextInt();                 // Read the number of elements
        int ar[] = new int[n];                  // Declare an array of size n

        // Take array input from user
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();             // Read each element
        }

        // Call the method to find third largest element
        ThirdLargest(ar);
    }

    static void ThirdLargest(int ar[]) {
        // Initialize first, second, and third largest variables 
        // with the smallest possible integer value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Traverse through the array elements
        for (int i = 0; i < ar.length; i++) {
            int num = ar[i]; // current element

            // If current number is greater than the first largest
            if (num > first) {
                // Shift first and second down
                third = second;
                second = first;
                first = num;
            }
            // If current number is smaller than first but greater than second
            else if (num > second && num != first) {
                // Shift second to third
                third = second;
                second = num;
            }
            // If current number is smaller than first and second but greater than third
            else if (num > third && num != first && num != second) {
                third = num;
            }
        }

        // Print the third largest number
        System.out.println(third);
    }

}
