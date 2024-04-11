public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {6,4,2,5};
        getMinAndMax(arr);
    }

    private static void getMinAndMax(int[] arr) {
        int min = arr[0];
        int max =  arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println("Min is " + min + " and Max is " + max);
    }
}
