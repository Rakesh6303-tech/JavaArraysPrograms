import java.util.*;

public class Demo {
    public static void main(String args[]) {
        int ar[] = {0, 2, 3, 1, 0, 5, 0, 3, 5, 0};
        int n = ar.length;
        int[] result = new int[n]; // result array filled with 0 by default

        int index = n - 1;

        // Traverse array from end to start, placing non-zero values from the end
        for (int i = n - 1; i >= 0; i--) {
            if (ar[i] != 0) {
                result[index] = ar[i];
                index--;
            }
        }

        // Output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
