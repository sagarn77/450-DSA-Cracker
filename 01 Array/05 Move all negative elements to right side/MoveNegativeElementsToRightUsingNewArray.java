public class MoveNegativeElementsToRightUsingNewArray {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        arr = moveElements(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] moveElements(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i : arr) {
            if (i >= 0) {
                arr2[j++] = i;
            }
        }
        for (int i : arr) {
            if (i < 0) {
                arr2[j++] = i;
            }
        }
        return arr2;
    }
}