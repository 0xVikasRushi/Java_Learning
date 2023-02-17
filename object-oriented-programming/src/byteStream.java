import java.io.FileInputStream;
import java.io.FileOutputStream;

public class byteStream {
    public static void main(String[] args) {
        String path="/Users/vikasrushi/Documents/Java_Learning/object-oriented-programming/src";
        try{
            FileInputStream in = new FileInputStream(path + "/file1.txt");
            FileOutputStream out = new FileOutputStream(path + "/file2.txt");

            byte[] arr = new byte[in.available()];
            int cnt;
            int index = 0;
            while((cnt=in.read())!=-1) {
               arr[index] = (byte) cnt;
               index++;
            }
            for (int i = 0; i <arr.length ; i++) {
                    out.write(arr[i]);
                System.out.print((char)arr[i]);
            }
            System.out.print((char)arr[0]);
        }catch (Exception e ){
            System.out.println(e);
        }

    }
}
