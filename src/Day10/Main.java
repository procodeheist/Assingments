package Day10;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Joining in the form of \"yyyy/MM/dd\"");
        String joinDate = scan.next();


       try{
           EmployeeBonus empBonus = new EmployeeBonus();
           String reply = empBonus.checkExperience(joinDate);
           System.out.println(reply);
       }catch (InvalidAge e){
           System.out.println(e.getMessage());
       }catch (DateTimeException d){
           System.out.println("Please pass the date in correct format");
       }
    }
}
