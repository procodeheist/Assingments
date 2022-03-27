package WeekEnd.BeanMap;

public class EmployeeBean {
    private int rollNum;
    private String name;
    private int salary;

    public EmployeeBean(int rollNum, String name, int salary) {
        this.rollNum = rollNum;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeBean() {
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
