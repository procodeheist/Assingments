package WeekEnd.PracticeNIO;

import java.io.*;

public class NewInOut {
    public static void main(String[] args) {
//        File myFile = new File("/home/raj/JavaFiles/test.txt");
//
//        try {
//            if(myFile.createNewFile()){
//                System.out.println("File created");
//            }
//            else
//                System.out.println("Edited the existing file");
//
//            FileWriter fw = new FileWriter(myFile);
//            fw.write(100);
//            fw.write("\n");
//            fw.write("Rajasekar\nDhanasekar");
//
//            fw.flush();
//            fw.close();
//            System.out.println("done");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FileReader fileReader = new FileReader(myFile);
//            int i=fileReader.read();
//            while( i != -1) {
//                System.out.print( (char)i);
//                i = fileReader.read();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/raj/JavaFiles/test.txt"));
//            bw.newLine();
//            bw.write(100);
//            bw.write("156");
//            bw.flush();
//            bw.close();
//            BufferedReader br = new BufferedReader(new FileReader("/home/raj/JavaFiles/test.txt"));
//
//            int red = br.read();
//            System.out.println("working"+red);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            PrintWriter printWriter = new PrintWriter("/home/raj/JavaFiles/test.txt");
            printWriter.println(100);
            printWriter.println(106);
            printWriter.println(104);
            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
