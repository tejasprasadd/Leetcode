import java.util.*;

//Brute Force method
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}

void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> result;
    result = solution.threeSum(nums);
    System.out.println(result);
}