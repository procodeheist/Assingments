package WeekEnd;

public class validParanthesis {
    public static void main(String[] args) {
        Solution sol = new Solution();
       boolean res = sol.isValid("{[]}");
        System.out.println(res);
    }
}
class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')'){
            return false;
        }
        if(s.charAt(s.length()-1) == '{' || s.charAt(s.length()-1) == '[' || s.charAt(s.length()-1) == '('){
            return false;
        }
        String[] stackArr = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                if(s.charAt(i) == '{'){
                    stackArr[i] = "{";
                }else if(s.charAt(i) == '['){
                    stackArr[i] = "[";
                }else {
                    stackArr[i] = "(";
                }
            }
            else if(s.charAt(i) == '}' && stackArr[i-1] == "{"){
                stackArr[i-1] = null;
            }
            else if(s.charAt(i) == '}' && stackArr[i-1] != "{"){
                return false;
            }
            else if (s.charAt(i) == ']' && stackArr[i-1] == "["){
                stackArr[i-1] = null;
            }
            else if (s.charAt(i) == ']' && stackArr[i-1] != "["){
                return false;
            }
            else if(s.charAt(i) == ')' && stackArr[i-1] == "("){
                stackArr[i-1] = null;
            }
            else if (s.charAt(i) == ')' && stackArr[i-1] != "("){
                return false;
            }
        }
        boolean flag = true;
        for(int i=0; i<stackArr.length; i++){
            if(stackArr[i] != null){
                flag = false;
            }
        }
        return flag;
    }
}