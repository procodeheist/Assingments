package Day11.CollectionAssignment1;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Employee> employeeTree = new TreeSet<>();

        System.out.println("Enter Employee Details:");
        System.out.println("=======================");

        while(true){
            System.out.println("Enter Name of the Employee:");
            String name = scan.next();
            System.out.println("Enter the Employee Id:");
            int empId = scan.nextInt();
            System.out.println("Enter the Salary of the Employee:");
            double salary = scan.nextDouble();

            employeeTree.add(new Employee(empId,name,salary));
            System.out.println("Do you want to add more employee details?(Y/N):");
            String choice = scan.next();

            if(choice.equalsIgnoreCase("N"))
                break;
        }

        System.out.println("===================================");
        System.out.println("The registered employee details are");
        System.out.println("===================================");

        int count=1;
       for(Employee emp:employeeTree){
           System.out.println("Emplyee"+ count++);
           System.out.println("Name:"+emp.getName());
           System.out.println("Employee Id:"+emp.getEmpId());
           System.out.println("Employee Salary:"+emp.getSalary());
           System.out.println("-----------------------------------");

       }
        System.out.println("================End================");

    }
}
