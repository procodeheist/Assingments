package Day9.ExceptionHandling2;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(String message) {
        super(message);
    }
}
