class generic1<T>{
    T ob;
    generic1(T k){
        ob = k;
    }
    T getob(){
        return ob;
    }
}
class generic2<T , V> extends generic1<T>{
    V ob2;
    generic2(T o,V ob22){
        super(o);
        ob2 = ob22;
    }
    void showtype(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
    V getOb2(){
       return ob2;
    }
}

public class geneicInterha {
    public static void main(String[] args) {
        generic2<Integer,String> k = new generic2<>(1,"djskd");
        System.out.println(k.getOb2());
        k.showtype();
    }
}
