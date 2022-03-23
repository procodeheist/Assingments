package Day14.ThreadExample;

public class Main {
    public static void main(String[] args) {
        Thread th = new Thread(new ThirdThread());
        th.start();
    }
}
