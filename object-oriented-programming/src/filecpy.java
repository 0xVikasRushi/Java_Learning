import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecpy {
    public static void main(String[] args) throws IOException {
        String path = "//Users//vikasrushi//Documents//Java_Learning//object-oriented-programming//src//";

        FileReader in = null;
        FileWriter out = null;
        try{
                in = new FileReader(path + "file1.txt");
                out = new FileWriter(path + "file2.txt");

                int cnt;
                while((cnt = in.read())!=-1){
                    System.out.println(cnt);
                    out.write((char)cnt);
                }
            System.out.println(cnt);
        }finally {
            in.close();
            out.close();
        }

    }
}
