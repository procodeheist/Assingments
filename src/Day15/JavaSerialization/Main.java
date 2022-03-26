package Day15.JavaSerialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student studentObj = new Student(1234,"Raj","chennai","raj@1234","asd123");

        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentObj);
        System.out.println("Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Student std1 = (Student) ois.readObject();
        System.out.println(std1.toString());
    }
}
