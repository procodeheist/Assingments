package EvaluationC4.SerialHasARelation;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee newEmployee = new Employee("15236519","Rajasekar",new Adress("TamiNadu","City","600012"),"raj@gmail.com","1234");

        ObjectOutputStream employeeObj = new ObjectOutputStream(new FileOutputStream("emp.txt"));
        employeeObj.writeObject(newEmployee);

        ObjectInputStream readEmployeeObj = new ObjectInputStream(new FileInputStream("emp.txt"));
        Employee employeeReader = (Employee) readEmployeeObj.readObject();

        System.out.println(employeeReader);
    }
}
