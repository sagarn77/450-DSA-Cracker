public class ReverseOfArrayUsingNewArray {
    public static void main(String[] args) {
        int[] arr = {6,4,2,5};
        arr = reverseArray(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] reverseArray(int[] arr) {
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            reverseArr[arr.length - 1 - i] = arr[i];
        }
        return reverseArr;
    }
}
