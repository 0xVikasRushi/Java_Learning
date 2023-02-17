import java.util.Scanner;

public class expection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int dem;
        try{
            num  = sc.nextInt();
            dem  = sc.nextInt();
            float res = num / dem;
            System.out.println(res);
        }catch (ArithmeticException e ){
            System.out.println(e);
        }catch (Exception e ){
            System.out.println(e);
        }finally {
            System.out.println("always run ");
        }
    }
}
