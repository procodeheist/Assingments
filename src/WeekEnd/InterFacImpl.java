package WeekEnd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class InterFacImpl {


    public static void main(String[] args) {

//        InterFac intObj =()-> System.out.println("hello");
//        intObj.func1();
//        intObj.defMeth();
//        InterFac.statMeth();

        List <String> myList = Arrays.asList("Raj","Gowtham","Dhana","Prasath","Pradeep");

        myList.stream().sorted(String::compareTo).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        Collections.replaceAll(myList,"Raj","Rajasekar");
        System.out.println(myList);
    }
}
