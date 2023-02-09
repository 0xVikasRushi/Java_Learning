class Rect{
    int l,b,area,perimeter;
    Rect(int _l, int _b){
        l = l;
       b =  _b;
    }
    Rect(){
        l = 10;
        b = 10;
    }
    Rect(int _l, int _b,String sike){
        l  = _l;
        b = _b;
        System.out.println(sike);
    }
}
public class contructoroverloding {
    public static void main(String[] args) {
        Rect rect = new Rect(10,10,"dajois");
    }
}
