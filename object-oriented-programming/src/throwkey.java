public class throwkey {
    public static void main(String[] args) {
        try{
            System.out.println(divide(10,0));
        }catch (ArithmeticException e ){
            System.out.println(e);
        }

    }
    public static int divide(int a, int b){
        if(b==0) throw new ArithmeticException("b is zero");
        else return a / b;

    }
}

