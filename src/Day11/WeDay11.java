package Day11;

import java.util.ArrayList;
import java.util.Iterator;

public class WeDay11 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10);
        al.add(1);
        al.add(0);
        al.add(2,null);
        System.out.println(al);

        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
