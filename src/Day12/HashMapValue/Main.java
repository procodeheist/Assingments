package Day12.HashMapValue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Student> studentMap = new HashMap<>();

        studentMap.put("Chennai",new Student(1,"a",1));
        studentMap.put("Kerala",new Student(3,"m",3));
        studentMap.put("Mumbai",new Student(5,"af",6));
        studentMap.put("Pune",new Student(8,"g",4));
        studentMap.put("Bangalore",new Student(2,"sd",7));

        Set<Map.Entry<String,Student>> entrySet = studentMap.entrySet();

        Collection<Student> studentSet = studentMap.values();


        for (Student std:studentSet){
            System.out.println(std);
        }
    }
}
