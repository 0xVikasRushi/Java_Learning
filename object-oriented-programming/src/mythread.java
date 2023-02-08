 class mythread extends Thread {
   mythread(){
       super(" My thread");
       System.out.println("My thread " + this);
       start();
   }
   public void run (){
       try
       {
           for (int i = 5; i > 0  ; i--) {
               System.out.println("new theard" + i);
               Thread.sleep(1000);
           }
       }catch (InterruptedException e){
           System.out.println("interrupted Exception");
       }
       System.out.println("Exiting thread");
   }
}

class mythreadimpl  {
    public static void main(String[] args) {
        Thread mt = Thread.currentThread();
        mythread myt = new mythread();
        System.out.println(" MAIN" + mt);
        System.out.println("MYTHREAD "+ myt);
        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println("MAIN THREAD" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e ){
            System.out.println(e.getMessage());
        }
        System.out.println("exiting main");
    }
}
