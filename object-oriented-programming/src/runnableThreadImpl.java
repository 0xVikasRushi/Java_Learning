import java.io.IOException;

class runnableinterface implements Runnable {
    Thread th;
    runnableinterface(){
        th = new Thread(this,"runnablethread mf");
        th.start();
    }
    public void run (){
        for (int i = 0; i <5 ; i++) {

            System.out.println(Thread.currentThread() + " " +  i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException  E){
                System.out.println(E);
            }
        }
    }
}




class runnableThreadImpl {
    public static void main(String[] args) {
        runnableinterface th = new runnableinterface();
    }
}