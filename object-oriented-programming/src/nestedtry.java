public class nestedtry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 10;
            int[] c = new int[10];
            try{
                if(a==0){
                    System.out.println(c[100]);
                }
            }catch (ArithmeticException e ) {
                System.out.println(e);
            }
            catch (NullPointerException e ){
                System.out.println(e);
            }
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }
    }
}
