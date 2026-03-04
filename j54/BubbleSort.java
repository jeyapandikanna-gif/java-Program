import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // size of array
        int[] arr = new int[n];

        // Input array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int passCount = 0;

        // Bubble Sort
        for(int i = 0; i < n - 1; i++) {
            passCount++;
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNumber of Passes: " + passCount);
    }
}