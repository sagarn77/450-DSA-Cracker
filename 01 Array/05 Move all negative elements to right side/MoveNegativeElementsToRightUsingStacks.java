import java.util.Stack;

public class MoveNegativeElementsToRightUsingStacks {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        arr = moveElements2(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] moveElements2(int[] arr) {
        Stack<Integer> positiveStack = new Stack<>();
        Stack<Integer> negativeStack = new Stack<>();
        int j = arr.length - 1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] >= 0) {
                positiveStack.push(arr[index]);
            } else {
                negativeStack.push(arr[index]);
            }
        }
        while (!negativeStack.isEmpty()) {
            arr[j--] = negativeStack.pop();
        }
        while (!positiveStack.isEmpty()) {
            arr[j--] = positiveStack.pop();
        }
        return arr;
    }
}
