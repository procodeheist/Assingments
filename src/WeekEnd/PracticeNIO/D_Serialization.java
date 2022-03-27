package WeekEnd.PracticeNIO;

import java.io.*;

class human implements Serializable{
    transient int age=20;
    String name= "Rajasekar";
}
class Raj extends human{
    void nextLinePrint(){
        for(int i=0; i<name.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(name.charAt(j));
            }
            System.out.println("");
        }
    }
}


public class D_Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Raj myObj = new Raj();
//        myObj.nextLinePrint();

        FileOutputStream inputStream = new FileOutputStream("/home/raj/Desktop/JavaFiles/des.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(inputStream);
        objectOutputStream.writeObject(new Raj());
        FileInputStream fileInputStream = new FileInputStream("/home/raj/Desktop/JavaFiles/des.txt");
       ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Raj ob1 = (Raj) objectInputStream.readObject();
        ob1.nextLinePrint();
        System.out.println(ob1.age);

    }
}
