import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class groupAnagramsSolution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for (String word: strs){

            char[] chars = word.toCharArray();

            //Sorting the Character Array
            Arrays.sort(chars);

            //Converting back into string
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());

    }
}

class groupAnagramsMain {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagramsSolution1 solution = new groupAnagramsSolution1();
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
}
}