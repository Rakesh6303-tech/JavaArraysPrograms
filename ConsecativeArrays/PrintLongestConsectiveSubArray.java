package ConsecativeArray;
import java.util.*;

public class PrintLongestConscativeSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Read number of elements
		int n = scan.nextInt();
		
		// Create an array of size n
		int ar[] = new int[n];
		
		// Input array elements
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		// Call function to find and print the longest consecutive subarray
		LongestConsecativeSubArray(ar);
	}

	static void LongestConsecativeSubArray(int ar[]) {
		
		int count = 1;        // Counts current consecutive sequence length
		int max = 0;          // Stores the maximum length of consecutive sequence found so far
		int endingIndex = 0;  // Stores the index where the longest consecutive sequence ends
		int Startingindex = 0; // Stores the index where the longest consecutive sequence starts
		
		// Traverse the array up to second last element
		for (int i = 0; i < ar.length - 1; i++) {
			
			// Check if the next element is consecutive (difference = 1)
			if (ar[i + 1] - ar[i] == 1) {
				count++; // Increase the consecutive count
			} 
			else {
				// If current sequence breaks, check if it's the longest so far
				if (count > max) {
					max = count;       // Update max length
					endingIndex = i;   // Save the last index of this sequence
				}
				count = 1; // Reset count for next sequence
			}
		}
		
		// After loop, check once more for the last sequence
		if (count > max) {
			max = count;
			endingIndex = ar.length - 1; // Sequence ends at the last element
		}
		
		// Calculate starting index using ending index and max length
		Startingindex = endingIndex - max + 1;
		
		// Print the longest consecutive sequence
		System.out.print("Longest consecutive subarray: ");
		for (int i = Startingindex; i <= endingIndex; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
