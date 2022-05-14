import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       float years;
       int principleamount;
       float rateofinterest;

        System.out.print("Enter the Pricipleamount : ");
        principleamount = input.nextInt();
        System.out.print("Enter the years : ");
        years = input.nextFloat();
        System.out.print("Enter the rateof interest : ");
        rateofinterest = input.nextFloat();

        float simpleinterest =( principleamount * rateofinterest * years) / 100;

        System.out.print("Principle intrest : " + simpleinterest);



    }
}
