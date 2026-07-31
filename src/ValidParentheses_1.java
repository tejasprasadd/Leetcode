import java.util.List;

//Brute Force solution
class ValidParentheses_1 {
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_1 solution = new ValidParentheses_1();
        String s="([)]";
        boolean result= solution.isValid(s);
        System.out.println(result);
    }
}