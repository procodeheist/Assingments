package Day9.ExceptionHandling2;

public class SavingAccount {
    int accountNumber;
    double balance;

    void deposit(int amount){
        this.balance = amount;
    };
    double withdraw(double amount) throws InsufficientFundException {
        if(amount>this.balance){
            throw new InsufficientFundException("Insufficient Amount in the Account");
        }
        return amount;
    }
}
