package Day7.problem3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number students going to register:");
        int num = scan.nextInt();

        Student[] studentDetail = new Student[num];

        for(int i=0; i<studentDetail.length; i++){
            System.out.println("Enter Detail Of Student: "+(i+1));

            System.out.println("Enter Student name:");
            String name = scan.next();

            System.out.println("Enter Student Roll-Number:");
            int rollNum = scan.nextInt();

            System.out.println("Enter Student Mark:");
            int mark = scan.nextInt();

            studentDetail[i] = new Student(rollNum,name,mark);
        }

        for(Student std:studentDetail){
            System.out.println("Student Name: "+std.getStudentName());
            System.out.println("Student Mark: "+std.getMarks());
            System.out.println("Student Roll-Number: "+std.getRollNumber());
        }
    }
}
