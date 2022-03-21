package EvaluationC2.VowelProblem;
import java.util.Scanner;
public class StringManipulator {
    public String removeVowels(String input) {
        StringBuffer strBuff = new StringBuffer("");
        if(input == null){
            return null;
        }
        else{
            for(int i=0; i<input.length(); i++){
                if(input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o' && input.charAt(i) != 'u'){
                    strBuff.append(input.charAt(i));
                }
            }
        }
    return strBuff.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringManipulator strObj = new StringManipulator();
        System.out.println("Please Enter A Valid String");

        String str = scan.next();
        str = str.toLowerCase();

        String res = strObj.removeVowels(str);
        System.out.println(res);
    }
}
