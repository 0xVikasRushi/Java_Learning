
class syncmythread1 {
   public void mq(){
        for (int i = 0; i < 3; i++) {
            synchronized(this){
                System.out.println(Thread.currentThread()+" " +i);
            }

        }

    }
}
class mythread1 extends Thread{
//    Thread t;
    mythread1(){
        super("new");
        start();
    }
    public void run(){
        try{
            syncmythread1 p = new syncmythread1();
            p.mq();
        }catch (Exception e ){
            System.out.println(e);
        }
    }
}
public class sync {
    public static void main(String[] args) {
        mythread1 t1= new mythread1();
        mythread1 t2 = new mythread1();
        mythread1 t3= new mythread1();
    }
}
