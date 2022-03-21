package EvaluationC3.SortingEmployee;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Employee> employeeSet  = new TreeSet<>();
        int count=1;
        System.out.println("Enter the details of Employee");
        System.out.println("===============================");
        while(true){
            System.out.println("Enter the Detail of Employee:"+ count++);
            System.out.println("Employee ID:");
            int empId = scan.nextInt();
            System.out.println("Name:");
            String name = scan.next();
            System.out.println("Enter Salary:");
            double salary = scan.nextDouble();
            System.out.println("Address:");
            String address = scan.next();
            employeeSet.add(new Employee(empId,name,address,salary));

            System.out.println("Do you want to add more:(Y/N)?");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("n")){
                break;
            }
        }
        int lCount = 1;
        for(Employee emp:employeeSet){
            System.out.println("Employee"+ lCount++);
            System.out.println("Name:"+emp.getName());
            System.out.println("Employee Id:"+emp.getEmpId());
            System.out.println("Address:"+emp.getAddress());
            System.out.println("Salary:"+emp.getSalary());
            System.out.println("----------------------------");
        }
    }
}
