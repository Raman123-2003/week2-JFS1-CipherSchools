import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("/Users/raman/Desktop/TestFile.txt");
        
        if (f.exists()) {
            System.out.println("Printing File Details");
            System.out.println("----------------------");
            System.out.println("File Name: " + f.getName());
            System.out.println("File Size: " + f.length());
            System.out.println("File Path: " + f.getAbsolutePath());
            System.out.println("Is File Readable? " + f.canRead());
            System.out.println("Is File Writable? " + f.canWrite());
        }
    }
}
