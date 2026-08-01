import java.util.Arrays;
// Built in function
public class BinarySearch_2 {

    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ?index : -1;
    }

    public static void main(String[] args) {
        BinarySearch_2 solution = new BinarySearch_2();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = solution.search(nums, target);
        System.out.println(result);
    }
}
