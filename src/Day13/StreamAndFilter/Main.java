package Day13.StreamAndFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(5647,"Raj",1000));
        studentList.add(new Student(5695,"Prem",1200));
        studentList.add(new Student(5988,"Gowtham",1100));
        studentList.add(new Student(5867,"Ram",700));
        studentList.add(new Student(5767,"Ravi",800));

        List<Student> finalList = studentList.stream().filter(student -> student.getMark()>800).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
