import java.util.Scanner;

public class celsius {

    public static void main(String[] args) {
        System.out.print("Enter the temp in celsius : ");
        Scanner input  = new Scanner(System.in);
        float cel = input.nextFloat();
        double far =  cel * 1.8 + 32;
        System.out.println(".F Coversion is : " + far);


    }
}
