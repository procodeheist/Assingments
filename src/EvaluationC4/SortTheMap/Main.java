package EvaluationC4.SortTheMap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public Map<String,BeanEmployee> getSortedMapWithValue(Map<String,BeanEmployee> originalMap){
        Set<Map.Entry<String,BeanEmployee>> employeeSet = originalMap.entrySet();

       List<Map.Entry<String,BeanEmployee>> employeeList = employeeSet.stream().sorted((empObj1, empObj2)->{
            BeanEmployee employee1 = (BeanEmployee) empObj1.getValue();
            BeanEmployee employee2 = (BeanEmployee) empObj2.getValue();
            return employee1.getSalary() < employee2.getSalary() ? 1 : -1;
        }).collect(Collectors.toList());

       Map<String,BeanEmployee> sortedEmp = new LinkedHashMap<>();

        for(Map.Entry<String,BeanEmployee> convertEmp:employeeList){
            sortedEmp.put(convertEmp.getKey(),convertEmp.getValue());
        }

        return sortedEmp;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();

        Map<String,BeanEmployee> beanEmployeeMap = new HashMap<>();
        beanEmployeeMap.put("HR",new BeanEmployee("1546","Rajasekar",80000.0));
        beanEmployeeMap.put("Sales",new BeanEmployee("1535","Gowtham",94000.0));
        beanEmployeeMap.put("Marketing",new BeanEmployee("1587","Dhanasekar",87000.0));
        beanEmployeeMap.put("Accounts",new BeanEmployee("1544","Prasarh",40000.0));

        Map<String,BeanEmployee> sortedEmployeeList = mainObj.getSortedMapWithValue(beanEmployeeMap);

        Set<Map.Entry<String,BeanEmployee>> displayEmployee = sortedEmployeeList.entrySet();

        for(Map.Entry<String,BeanEmployee> display: displayEmployee){
            System.out.println(display.getKey()+"-->"+display.getValue());
        }
    }
}
