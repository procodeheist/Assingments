package EvaluationC4.DateAndTime;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;


public class DateAndTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Date Of Birth In The Form Of \"dd/MM/yyyy\"");
        String dob = scan.next();

        DateAndTime dateObj = new DateAndTime();

        try{
            int age = dateObj.provideAge(dob);
            System.out.println(age);
        }catch (DateTimeException d){
            System.out.println("please pass the date in the proper format");
        }catch (InputMismatchException in){
            System.out.println("Date of birth should not be in future");
        }

    }

    public int provideAge(String dob) throws DateTimeException {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bDay = LocalDate.parse(dob,dateFormat);
        LocalDate currentDate = LocalDate.now();

        int age =(int) ChronoUnit.YEARS.between(bDay,currentDate);
        if(age<1){
            throw new InputMismatchException();
        }
        return age;
    }
}
