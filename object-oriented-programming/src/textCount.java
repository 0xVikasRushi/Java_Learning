import java.io.FileInputStream;
import java.io.IOException;

public class textCount {
    public static void main(String[] args) throws IOException {
        String path = "//Users//vikasrushi//Documents//Java_Learning//object-oriented-programming//src//";
        try{
            int lines=0,chars=0,words=0;
            int code=0;
            FileInputStream fis = new FileInputStream(path + "file1.txt");
            while(fis.available()!=0)
            {
                code = fis.read();
                if(code!=10) // not a line
                    chars++;
                if(code==32) // space with word
                    words++;
                if(code==13)
                {
                    lines++;
                    words++;
                }
            }
            System.out.println("No.of characters = "+chars);
            System.out.println("No.of words = "+(words+1));
            System.out.println("No.of lines = "+(lines+1));
            fis.close();
        }catch (IOException E){
            System.out.println(E);
        }



    }
}
