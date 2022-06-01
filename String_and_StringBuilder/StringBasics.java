package String_and_StringBuilder;
import java.util.Scanner;
public class StringBasics {
    public static void main(String[] args) {
        String firstname = "Vikas";
        String secondname = "Rushi";
        System.out.println(firstname);


        //Scanner
        Scanner in = new Scanner(System.in);
// 		String Date0fBirth = in.nextLine();
// 		System.out.println(Date0fBirth);

        System.out.println(firstname+" "+secondname);
        for(int i=0;i<firstname.length();i++){
            System.out.println(firstname.charAt(i));
        }

        //comparing string

        String n1 = "test";
        String n2 = "test";
        if(n2.equals(n1)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        // substring(start,end)

        System.out.println(firstname.substring(2));


        //





    }
}
