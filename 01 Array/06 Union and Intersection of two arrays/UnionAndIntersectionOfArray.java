import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7};
        System.out.println("Union is = " + findUnion(arr, arr2));
        System.out.println("Union is = " + findIntersection(arr, arr2));
    }

    public static int findUnion(int[] arr, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (Integer ele : arr) {
            set.add(ele);
        }
        for (Integer ele : arr2) {
            set.add(ele);
        }
        return set.size();
    }

    public static int findIntersection (int[] arr, int[] arr2){
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer ele : arr) {
            set.add(ele);
        }
        for (Integer ele : arr2) {
            if (set.contains(ele)) {
                res++;
            }
        }
        return res;
    }
}