public class RotateAnArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = rotateBy1(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] rotateBy1(int[] arr) {
        int temp = arr[0];
        for (int j = 0; j < arr.length; j++) {            
            if(j == arr.length - 1){
                arr[j] = temp;
            }else{
                arr[j] = arr[j+1];
            }
        }
        return arr;
    }
}