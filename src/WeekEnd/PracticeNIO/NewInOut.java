package WeekEnd.PracticeNIO;

import java.io.*;

public class NewInOut {
    public static void main(String[] args) {
        File myFile = new File("/home/raj/JavaFiles/test.txt");

        try {
            if(myFile.createNewFile()){
                System.out.println("File created");
            }
            else
                System.out.println("Edited the existing file");

            FileWriter fw = new FileWriter(myFile);
            fw.write(100);
            fw.write("\n");
            fw.write("Rajasekar\nDhanasekar");

            fw.flush();
            fw.close();
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(myFile);
            int i=fileReader.read();
            while( i != -1) {
                System.out.print( (char)i);
                i = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
