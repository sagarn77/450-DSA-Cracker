public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 2, 1 };
        int n = arr.length;
        arr = solution(arr, n);
        for (int i : arr) {
            System.err.println(i);
        }
    }

    private static int[] solution(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:{
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        return arr;
    }
}