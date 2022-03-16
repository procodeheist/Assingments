package Day9.ExceptionHandling2;
import java.util.Scanner;
public class BankDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingAccount account = new SavingAccount();

        System.out.println("Enter the amount to be deposited");
        int amount = scan.nextInt();
        account.deposit(amount);

        System.out.println("Enter the amount to be withdrawn");
        double amountWithDraw = scan.nextInt();

        try{
            double res = account.withdraw(amountWithDraw);
            System.out.println(res+" is withdrawn");
        }catch (InsufficientFundException e){
            System.out.println(e.getMessage());
        }

    }
}
