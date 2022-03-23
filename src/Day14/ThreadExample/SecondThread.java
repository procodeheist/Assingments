package Day14.ThreadExample;

public class SecondThread extends Thread{
    @Override
    public void run(){
        System.out.println("From run");
    }
    public static void main(String[] args) {
        Thread obj = new SecondThread();
        obj.start();
        obj.run();
    }
}
