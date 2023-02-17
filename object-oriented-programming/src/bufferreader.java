import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class bufferreader {
    public static void main(String[] args) throws IOException {
        String path = "//Users//vikasrushi//Documents//Java_Learning//object-oriented-programming//src//";
       try {
           FileReader f = new FileReader(path  +  "file1.txt");
           BufferedReader b = new BufferedReader(f);

       }catch (IOException e ){
           System.out.println(e);
       }

    }
}
