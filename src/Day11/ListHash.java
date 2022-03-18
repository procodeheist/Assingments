package Day11;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class ListHash {
    public static void main(String[] args) {
        Set<Student> hashList = new HashSet<>();
        hashList.add(new Student(500,"Raj",6456));
        hashList.add(new Student(450,"Gowtham",6445));
        hashList.add(new Student(450,"Gowtham",6445));
        hashList.add(new Student(600,"Prasath",6447));
        for(Student std:hashList){
            System.out.println(std);
        }
    }
}
