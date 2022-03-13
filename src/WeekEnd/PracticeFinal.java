package WeekEnd;

public class PracticeFinal implements Package  {
    @Override
    public void checkFun(){
        System.out.println("Heloo from interface");
    }
    public static void main(String[] args) {
        Package pf = new PracticeFinal();
        pf.checkFun();
        System.out.println(PracticeFinal.age);
    }
}
