import java.util.*;


class FindDisappearedNumbers_1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDisappearedNumbers_1 solution = new FindDisappearedNumbers_1();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();
        result = solution.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}
