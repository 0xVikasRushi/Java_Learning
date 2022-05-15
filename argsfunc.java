package Functions_and_methods;

public class argsfunc {
    public static void main(String[] args) {
        int d = add(5,2);
        System.out.println(d);

        String Personal = greet("Vikas Rushi");
        System.out.println(Personal);
    }
    static int add(int a , int b){
        int c = a+b;
        return c;

    }

    static String greet(String name){
        String message = "name : " + name;
        return message;
    }
}
