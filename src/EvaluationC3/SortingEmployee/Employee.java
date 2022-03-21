package EvaluationC3.SortingEmployee;

public class Employee implements Comparable<Employee>{
    private int empId;
    private String name;
    private String address;
    private double salary;

    public Employee(int empId, String name, String address, double salary) {
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(o.salary>salary)
            return +1;
        else if(o.salary<salary)
            return -1;
        else
           return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
