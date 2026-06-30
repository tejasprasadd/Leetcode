import java.util.HashSet;
import java.util.Set;

class ContainsDuplicateSolution {
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
}

class ContainsDuplicate {
    public static void main(String[] args) {

        ContainsDuplicateSolution solution = new ContainsDuplicateSolution();

        int[] nums = {1, 2, 3, 1};

        boolean answer = solution.containsDuplicate(nums);

        System.out.println(answer);
    }
}