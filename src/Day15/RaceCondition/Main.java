package Day15.RaceCondition;

public class Main {
    public static void main(String[] args) {
        Common c = new Common();
    Thread newThread = new Thread(()->{
        c.setBalance(10000);
    });
    Thread with = new Thread(()->{
        c.withdrawMoney(500);
    });
        newThread.start();
        with.start();



    }
}
