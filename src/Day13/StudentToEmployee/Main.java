package Day13.StudentToEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(12465,"Raj",1200));
        studentList.add(new Student(54456,"Prem",900));
        studentList.add(new Student(43566,"Gowtham",1100));
        studentList.add(new Student(78673,"Ram",800));
        studentList.add(new Student(78694,"Varun",600));

//        Function<Student,Employee> myMap = student -> {
//            Employee employee1 = new Employee(student.getRoll(),student.getName(), student.getMark()*1000);
//            return employee1;
//        };
        List<Employee> employeeList =  studentList.stream().map((student)->{
            Employee employee1 = new Employee(student.getRoll(),student.getName(), student.getMark()*1000);
            return employee1;
        }).collect(Collectors.toList());

        System.out.println(employeeList);

    }
}
