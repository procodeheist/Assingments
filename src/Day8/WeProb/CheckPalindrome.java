package Day8.WeProb;

public class CheckPalindrome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean res = sol.isPalindrome("0P");
        System.out.println(res);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer copy = new StringBuffer(s.toLowerCase());
        StringBuffer str = new StringBuffer("");

        for(int i=0; i<s.length(); i++){
            if((int)copy.charAt(i) >= 97 && (int)copy.charAt(i)<=123){
                str = str.append(copy.charAt(i));
            }
        }
        System.out.println(str);
       return checkPal(str);
    }

    private boolean checkPal(StringBuffer str) {
        int start=0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}