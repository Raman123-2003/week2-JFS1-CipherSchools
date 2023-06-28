import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("/Users/raman/Desktop/TestFile.txt");

        fw.write("I am The Earth \n");
        fw.write("I am The Forest Green \n");
        fw.write("I am the Four Winds Blowing \n");
        fw.write("I am the Earth \n");

        fw.flush();


        fw.close();

        System.out.println("File Prepared Successfully");
    }
}
