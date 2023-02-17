class runnablethread  implements Runnable {
    Thread th;
    runnablethread(){
        th= new Thread(this,"my thread");
        th.start();
    }
    public void run (){
        for (int i = 0; i < 4 ; i++) {
            System.out.println(Thread.currentThread() + " " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                System.out.println(e);
            }
        }
    }
}

public class runnableThreadImpl {
    public static void main(String[] args)   {
        runnablethread th = new runnablethread();
        Thread t1 = new Thread();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() + " " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                System.out.println(e);
            }
        }
    }
}