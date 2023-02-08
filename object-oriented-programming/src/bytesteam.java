import java.io.*;
public class bytesteam {
    public static void main(String[] args) {
        String path = "//Users//vikasrushi//Documents//Java_Learning//object-oriented-programming//src//";

        try (

                FileInputStream in = new FileInputStream(path + "file1.txt");
                FileOutputStream out = new FileOutputStream(path + "file2.txt"))
        {

            byte byteArray[] = new byte[in.available()];

            int cnt;
            int index = 0;
            System.out.print (" input file content : ");
            while((cnt=in.read())!=-1){
              byteArray[index] = (byte)cnt;
              System.out.print((char)cnt);
              index++;
            }
            System.out.print(" | output file content : ");
            for (int i = 0; i <byteArray.length ; i++) {
                out.write(byteArray[i]);
                System.out.print((char)byteArray[i]);
            }


//                while ((c = in.read()) != -1) {
////                    System.out.print((char) c);
//
//                    out.write(c);
//                }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
