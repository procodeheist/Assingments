package Day11.CollectionAssignment1;

import Day11.Practice.Student;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String name;
    private double salary;
    public Employee(int empId,String name,double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(o.empId< empId){
            return +1;
        }
        else{
            return -1;
        }
    }
}
