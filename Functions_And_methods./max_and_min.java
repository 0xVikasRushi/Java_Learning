package Functions_and_methods;

public class max_and_min {
    public static void main(String[] args) {

       int d = Max(3,4,5);
        int e = Min(2,4,42);
        System.out.println("Max : "+ d);
        System.out.println("Min : "+e);

    }
    static int Max(int a,int b,int c){
        int tempmax =a;
        if(tempmax < b){
            tempmax = b;
        }
        if (tempmax < c);
        {
            tempmax = c;
        }
        return tempmax;
    }
    static int Min(int a,int b,int c){
        int tempmin =a;
        if(tempmin > b){
            tempmin = b;
        }
        if (tempmin < c);
        {
            tempmin = c;
        }
        return tempmin;
    }
}
