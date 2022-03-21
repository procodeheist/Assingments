package EvaluationC2.RangeProblem;
import java.util.Scanner;
public class PrintRange {
    String printTheRange(int start,int end, int increment){
            if(start<0 || increment<1 || start>=end){
                return "Error";
            }
            StringBuffer str = new StringBuffer("");
            for(int i=start; i<=end; i= i+increment){
                str.append(i+" ");
            }
            return str.toString();
    }

    public static void main(String[] args) {
        PrintRange obj = new PrintRange();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter The Start number");
        int start = scan.nextInt();

        System.out.println("Please Enter The End number");
        int end = scan.nextInt();

        System.out.println("Please Enter The Increment number");
        int increment = scan.nextInt();

        String ans = obj.printTheRange(start,end,increment);
        System.out.println(ans);
    }
}
