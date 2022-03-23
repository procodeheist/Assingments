package Day14.ThreadExample;

public class FIrstThread {
    public static void main(String[] args) {
        Thread firstThread = new Thread(()->{
           for(int i=0; i<25; i++){
               System.out.println("Hello"+i);
           }
        });
        firstThread.start();

        try {
            Thread.sleep(1000);
            System.out.println("Main End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
