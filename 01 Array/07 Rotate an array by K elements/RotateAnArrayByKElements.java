public class RotateAnArrayByKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = rotateByK(arr, 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] rotateByK(int[] arr, int k) {
        int val = k % arr.length;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[(i + val) % arr.length];
        }
        return arr2;
    }
}
