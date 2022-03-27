package Day15.NewInOut;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
        int str = reader.read();
        while (str != -1){
            System.out.print((char) str);
            str = reader.read();
        }
        reader.close();

    }
}
