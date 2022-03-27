package Day15.NewInOut;

import java.io.FileReader;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader("student.txt");
        int readerFile = fileReader.read();
        while (readerFile != -1){
            System.out.print((char) readerFile);
            readerFile = fileReader.read();
        }
        fileReader.close();

    }
}
