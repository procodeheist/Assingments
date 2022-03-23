package Day14.GettingAndSetting;

class ThreadA implements Runnable{
    @Override
    public void run() {
        String tname=Thread.currentThread().getName();
        synchronized (this){
            for(int i=0;i<2;i++){

                System.out.println(tname +" is running ");
                System.out.println("Inside sync");
            }
        }
        System.out.println(tname+" not sync");
    }

}
class ThreadB implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            String tname=Thread.currentThread().getName();
            System.out.println(tname +" is running ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ThreadA ta=new ThreadA();
        //ThreadB tb=new ThreadB();
        Thread t1=new Thread(ta);
        Thread t2=new Thread(ta);
        t1.setName("simran");
        t2.setName("Raj");
        t1.start();
        t2.start();
    }
}