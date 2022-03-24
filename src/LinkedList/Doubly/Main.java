package LinkedList.Doubly;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DoublyList doublyList = new DoublyList();

        doublyList.insert(17);
        doublyList.insert(12);
        doublyList.insert(55);
        doublyList.insert(4);
        doublyList.insert(29);

        //doublyList.display();

        List<Integer> linkDefaultList = new LinkedList<>();
        linkDefaultList.add(12);
        linkDefaultList.add(13);
        linkDefaultList.add(12);

        for(Integer list: linkDefaultList){
            System.out.println(list);
        }

    }
}
