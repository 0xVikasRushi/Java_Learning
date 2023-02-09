//    class runnableThread implements Runnable {
//    Thread t;
//    runnableThread(){
//        t = runnableThread(this,"new thread");
//        System.out.println("in const new thread");
//        t.start();
//    }
//    public void run(){
//        try{
//            for (int i = 5; i > 0 ; i--) {
//                System.out.println("runnable thread " + i);
//                Thread.sleep(1000);
//            }
//        }catch (InterruptedException E ){
//            System.out.println(E);
//        }
//    }
//}
//
//
//public class runnableThreadImpl {
//    public static void main(String[] args) {
//        Thread mt = new Thread();
//        runnableThreadImpl mtt=  new runnableThreadImpl();
//
//        try{
//            for (int i = 5; i > 0 ; i--) {
//                System.out.println("main thread " + i);
//                mt.sleep(1000);
//            }
//        }catch (InterruptedException E ){
//            System.out.println(E);
//        }
//    }
//}
