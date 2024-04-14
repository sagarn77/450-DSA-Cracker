public class LargestSumOfContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        int[] arr2 = {1,2,3,-2,5};
        int[] arr3 = {1,9,9,-2,-1};
        System.out.println(solution(arr3));
    }

    private static int solution(int[] arr) {
        int sum = 0;
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}

// Kadane's Algo - to find largest sum of contiguous subarray in O(n)
// Iterarte through a array
// Add the current element value in sum
// Assign max value between "max" and "sum" to "max"
// if sum is less than zero make sum as zero
// return max