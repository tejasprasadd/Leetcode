import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class groupAnagramsSolution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            //Counting the occurrences of each char in the string
            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();

            for (int num : count) {
                keyBuilder.append('#');
                keyBuilder.append(num);
            }
            String key = keyBuilder.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());

    }
}

class groupAnagramsMain2 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagramsSolution2 solution = new groupAnagramsSolution2();
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}