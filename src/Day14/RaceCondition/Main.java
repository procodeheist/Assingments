package Day14.RaceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name +" job started by Thread :"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +"..job completed by Thread :"+Thread.currentThread().getName());
    }
}
public class Main{
    public static void main(String[] args){
        PrintJob[] jobs={
                new PrintJob("Ram"),
                new PrintJob("Ravi"),
                new PrintJob("Anil"),
                new PrintJob("Shiva"),
                new PrintJob("Pawan"),
                new PrintJob("Suresh")
        };
        ExecutorService service = Executors.newFixedThreadPool(6);
        for(PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();//to shutdown the executorService.
    }
}
