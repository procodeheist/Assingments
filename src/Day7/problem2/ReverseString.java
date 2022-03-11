package Day7.problem2;
import java.util.Scanner;
public class ReverseString {
    public String reversString(String input){
        StringBuffer res = new StringBuffer("");
        for(int i=input.length()-1; i>=0; i--){
            res.append(input.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        ReverseString rev = new ReverseString();
        String result = rev.reversString(originalString);

        System.out.println("Original String is :"+ originalString);

        System.out.println("Reversed String is :"+ result);
    }


}
