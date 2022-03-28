package EvaluationC4.SortTheMap;

public class BeanEmployee {

    private String empID;
    private String name;
    private double salary;

    public BeanEmployee(String empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    public BeanEmployee() {
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
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
        return "BeanEmployee{" +
                "empID='" + empID + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
