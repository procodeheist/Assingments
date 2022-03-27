package Day15.NewInOut;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewIOClass {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("student.txt");
        List <String> readList = Files.readAllLines(myPath);
        for(String str:readList){
            System.out.println(str);
        }
    }
}
