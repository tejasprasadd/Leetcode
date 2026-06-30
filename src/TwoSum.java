import java.util.Arrays;
import java.util.HashMap;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int compliment;
        for(int i=0; i < nums.length; i++){
            compliment =  target-nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSumSolution solution = new TwoSumSolution();
        int[] result = solution.twoSum(nums,target);

        System.out.println(Arrays.toString(result));
    }
}