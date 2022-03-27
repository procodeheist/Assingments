package WeekEnd.BeanMap;

import java.util.*;
import java.util.stream.Collectors;

public class MapHash {
    public static void main(String[] args) {
        Map<String, StudentBean> studentBeanMap = new HashMap<>();
        studentBeanMap.put("Chennai", new StudentBean(152, "Raj", 1200));
        studentBeanMap.put("Mumbai", new StudentBean(178, "Ram", 1100));
        studentBeanMap.put("Pune", new StudentBean(162, "Ravi", 840));
        studentBeanMap.put("Kerala", new StudentBean(112, "Ramesh", 801));
        studentBeanMap.put("Hyderabad", new StudentBean(197, "Ranjith", 937));

        Set<Map.Entry<String,StudentBean>> studentSet = studentBeanMap.entrySet();
        System.out.println(studentBeanMap);
        System.out.println();
        for(Map.Entry<String,StudentBean> setS:studentSet){
            System.out.println(setS.getKey()+"-->"+setS.getValue());
        }

       List<EmployeeBean> empList = studentSet.stream().map((s)->{
           EmployeeBean employeeBean = new EmployeeBean(s.getValue().getRollNo(), s.getValue().toString(), s.getValue().getMarks() * 1000);
            return employeeBean;
        }).collect(Collectors.toList());

       List<EmployeeBean> res = empList.stream().sorted((a,b)->{
            EmployeeBean s1 =  a;
            EmployeeBean s2 =  b;

            return s1.getSalary()<s2.getSalary()? 1 : -1;
        }).collect(Collectors.toList());
        System.out.println(res);
    }
}
