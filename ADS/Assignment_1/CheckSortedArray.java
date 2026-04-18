import java.util.Scanner;

public class CheckSortedArray {

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {   // input allowed (recursion restriction is for logic)
            arr[i] = sc.nextInt();
        }

        System.out.println("Is Sorted = " + isSorted(arr, 0));
        sc.close();
    }
}