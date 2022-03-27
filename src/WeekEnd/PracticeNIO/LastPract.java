package WeekEnd.PracticeNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class LastPract {
    public static void main(String[] args) throws IOException {
        Path nIOpath = Paths.get("/home/raj/Desktop/JavaFiles/des.txt");
        Path des = Paths.get("/home/raj/Desktop/JavaFiles/newDes.txt");
        System.out.println(Files.exists(nIOpath));
        String str = "Hello  using the new io";
        Files.write(nIOpath, str.getBytes());
        Files.copy(nIOpath,des);
    }
}
