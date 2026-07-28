// Sliding window solution but not optimal
import java.util.*;

class SlidingWindowMaximum_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        int left = 0, right = k, index=0;
        while (right <= n) {
//            int[] subArray = Arrays.copyOfRange(nums, left, right);
//            System.out.println(Arrays.toString(subArray));
            int max = maxValue(left, right, nums);
            result[index++]=max;
            left++;
            right++;
        }
        return result;
    }
    public int maxValue(int left, int right, int[] nums){
        int max = nums[left];
        for(int i=left; i<right;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum_1 solution = new SlidingWindowMaximum_1();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
