package WeekEnd;

public class InterFacImpl {


    public static void main(String[] args) {

        InterFac intObj =()-> System.out.println("hello");
        intObj.func1();
        intObj.defMeth();
        InterFac.statMeth();

    }
}
