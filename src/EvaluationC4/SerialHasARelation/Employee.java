package EvaluationC4.SerialHasARelation;

import java.io.Serializable;

public class Employee implements Serializable{ 
	
    private String empID;
    private String empName;
    Adress adress;
    private String email;
    transient private String password;

    public Employee(String empID, String empName, Adress adress, String email, String password) {
        this.empID = empID;
        this.empName = empName;
        this.adress = adress;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", adress=" + adress +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
