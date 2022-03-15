package Day9.ExceptionHandling1;
import java.awt.im.InputContext;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter num1");
            int num1 = sc.nextInt();
            System.out.println("Enter num2");
            try{
                int num2 = sc.nextInt();
                if(num2 == 0){
                    throw new InputMismatchException("");
                }
                String message = null;
                int num3 = num1 / num2;
                try {
                    if(num3 > 10){
                        message = "Welcome to Exception Handling ";
                    }
                    else {
                        throw new Exception("");
                    }
                    System.out.println("Message is :"+message.toUpperCase());
                }catch (Exception e){
                    System.out.println("String value is null");
                }
            }catch (InputMismatchException numZero){
                System.out.println("num2 should not be 0");
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter valid number");
        }






        System.out.println("end of main");
    }
}
