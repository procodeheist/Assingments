package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeDay11 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Student Details Below:");
        System.out.println("================================");
        int count=1;
        while(true){
            System.out.println("Enter the detail of Student:"+ count++);
            System.out.print("Name:");
            String name = scan.next();
            System.out.print("Roll No:");
            int rollNum = scan.nextInt();
            System.out.print("Mark:");
            int mark = scan.nextInt();
            studentList.add(new Student(mark,name,rollNum));
            System.out.println("Do You want to add more?(Y/N):");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("n"))
                break;
        }

        System.out.println("Registered Students are:");
        System.out.println("========================");
        for(Student std:studentList){
            System.out.println("Name:"+std.getName());
            System.out.println("------------------------");
            System.out.println("Roll Number:"+std.getRollNum());
            System.out.println("------------------------");
            System.out.println("Mark:"+std.getMark());
            System.out.println("========================");
        }
    }
}
