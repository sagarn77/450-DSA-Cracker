import java.util.Arrays;

public class KthSmallestAndLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4};
        int k = 2;
        solution(arr , k);
    }

    private static void solution(int[] arr, int k) {
        Arrays.sort(arr);
        int min = arr[k - 1];
        int max = arr[arr.length - k];
        System.out.println("Kth min is " + min + " Kth max is " + max);
    }
}