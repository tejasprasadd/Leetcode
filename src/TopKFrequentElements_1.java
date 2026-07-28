import java.util.*;

//HashMap solution

class TopKFrequentElements_1 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue()); // highest frequency first
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
    
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements_1 solution = new TopKFrequentElements_1();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
