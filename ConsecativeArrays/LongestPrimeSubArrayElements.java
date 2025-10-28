package ConsecativeArray;

import java.util.Scanner;

public class LongestPrimeSubArrayElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the size of the array from the user
        int n = scan.nextInt();

        // Create an array of size 'n'
        int ar[] = new int[n];

        // Read 'n' elements from the user and store them in the array
        for(int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        // Call the method to print the longest consecutive prime subarray
        PrintLongestPrime(ar);
    }

    // Method to find and print the longest consecutive prime subarray
    static void PrintLongestPrime(int ar[]) {
        int count = 0;       // Tracks the current sequence of consecutive primes
        int max = 0;         // Stores the maximum length of prime sequence found
        int StartIndex = 0;  // Start index of the longest prime subarray
        int EndIndex = 0;    // End index of the longest prime subarray
        int tempstart = 0;   // Temporary start index of current prime sequence

        // Traverse the array
        for(int i = 0; i < ar.length; i++) {
            if(isprime(ar[i])) {          // Check if current element is prime
                count++;                  // Increment current prime sequence counter

                if(count == 1)            // First prime in the current sequence
                    tempstart = i;        // Mark the start index of this sequence

                if(count > max) {         // Update max sequence if current is longer
                    max = count;
                    StartIndex = tempstart; // Record the start index of longest sequence
                    EndIndex = i;          // Record the end index of longest sequence
                }
            } else {
                count = 0;                 // Reset counter if element is not prime
            }
        }

        // Print elements of the longest consecutive prime subarray
        for(int i = StartIndex; i <= EndIndex; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    // Method to check whether a number is prime
    static boolean isprime(int n) {
        if(n <= 1) return false;           // 0 and 1 are not prime

        // Check divisibility from 2 to sqrt(n)
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)                 // Not prime if divisible by any number
                return false;
        }

        return true;                       // Prime if not divisible by any number
    }
}
