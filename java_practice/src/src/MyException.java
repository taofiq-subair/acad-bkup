import java.io.FileReader;
import java.io.IOException;

public class MyException {
    public static void myReader(String fileName) {
        try (FileReader r = new FileReader(fileName)) {
        }
        catch(IOException e ){
            System.out.println("File not found");
        }
    }
}
