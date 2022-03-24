package Day14.RaceCondition;

class Counter implements Runnable
{
    private int c = 0;
    public void increment() {
        try
        {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        c++;
    }
    public void decrement()
    {
        c--;
    }
    public int getValue()
    {
        return c;
    }
    @Override
    public void run() {
        //incrementing
        synchronized (Counter.class){
            this.increment();
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());
            this.decrement();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());
        }
        //decrementing
    }
}
public class RaceConditionDemo
{
    public static void main(String args[])
    {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Thread t1 = new Thread(counter);
        t1.setName("Raj");
        Thread t2 = new Thread(counter2);
        t2.setName("Dhana");
//        Thread t3 = new Thread(counter);
//        t3.setName("Gowtham");
        t1.start();
        t2.start();
       // t3.start();
    }
}
