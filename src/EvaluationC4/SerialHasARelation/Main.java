package EvaluationC4.SerialHasARelation;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee newEmployee = new Employee("15236519","Rajasekar",new Adress("TamiNadu","City","600012"),"raj@gmail.com","1234");

        ObjectOutputStream employeeObj = new ObjectOutputStream(new FileOutputStream("emp1.txt"));
        employeeObj.writeObject(newEmployee);

        employeeObj.close();
        ObjectInputStream readEmployeeObj = new ObjectInputStream(new FileInputStream("emp1.txt"));
        Employee employeeReader = (Employee) readEmployeeObj.readObject();
        readEmployeeObj.close();
        System.out.println(employeeReader);
    }
}
