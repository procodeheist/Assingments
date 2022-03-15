package Day9.ExceptionHandling2;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount();
        account.deposit(100);
        try{
            double res = account.withdraw(101);
            System.out.println(res+" is withdrawn");
        }catch (InsufficientFundException e){
            System.out.println(e.getMessage());
        }

    }
}
