import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int element : nums) {
            if (set.contains(element)) {
                return true;
            }
            set.add(element);
        }

        return false;
    }
    public static void main(String[] args) {

        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};

        boolean answer = solution.containsDuplicate(nums);

        System.out.println(answer);
    }
}
