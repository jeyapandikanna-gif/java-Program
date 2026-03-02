import java.util.Scanner;

public class LinearSearchExample {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;   // element found
            }
        }
        return -1;   // element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int result = linearSearch(arr, key);

        if (result != -1)
            System.out.println("Index: " + result);
        else
            System.out.println("-1");

        sc.close();
    }
}