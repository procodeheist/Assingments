package Day12.HashMapValue;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String,Student> studentMap = new HashMap<>();

        studentMap.put("Chennai",new Student(1,"a",1));
        studentMap.put("Kerala",new Student(3,"m",3));
        studentMap.put("Mumbai",new Student(5,"af",6));
        studentMap.put("Pune",new Student(8,"g",4));
        studentMap.put("Bangalore",new Student(2,"sd",7));

        Set<Map.Entry<String,Student>> entrySet = studentMap.entrySet();

        List<Map.Entry<String,Student>> entryList = new ArrayList<>(entrySet);

       List<Map.Entry<String,Student>> resList= entryList.stream().sorted((a,b)->{
           Student s1 = a.getValue();
           Student s2 = b.getValue();
           return s1.getMark() > s2.getMark() ? +1 : -1;
       }).collect(Collectors.toList());

        resList.stream().forEach(stringStudentEntry -> {
            System.out.println(stringStudentEntry.getKey()+"->"+stringStudentEntry.getValue());
        });
    }
}
