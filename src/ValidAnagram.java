import java.util.HashMap;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if(s.length() == t.length() && (s.length() == 0)){
            return true;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0 ; i< s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";
        boolean answer = solution.isAnagram(s,t);
        System.out.println(answer);
    }
}
