
class TWOGEN<T,V>{
    T ob1;
    V ob2;
    TWOGEN(T _ob1,V _ob2){
        ob1 =  _ob1;
        ob2 =  _ob2;
    }
    void showTypes(){
        System.out.println("types of t is " + ob1.getClass().getName());
        System.out.println("types of v is " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
public class generic_two_parameter {
    public static void main(String[] args) {

        TWOGEN<String,Integer> g1 = new TWOGEN<String,Integer>("vikas",1);
        g1.showTypes();
        String a = g1.getOb1();
        System.out.println(a);
    }
}
