public class ReverseOfArrayUsingTwoPointerApproach {
    public static void main(String[] args) {
        int[] arr = {6,4,2,5};
        arr = reverseArray(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int temp = 0;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }        
        return arr;
    }
}
