class SimpleInt
{
    private int R=9;
    private float SI;
      void calcSI(int P,int T)
    {
        SI=P*T*R/100;
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("SI ="+SI +" for P= " +P +" and T= "+T);
    }
}
class Deposits implements Runnable
{
    int P,T;
    SimpleInt SIob;
    Thread th;
    public Deposits(SimpleInt siob,int p,int t)
    {
        SIob=siob;
        P=p;
        T=t;
        th=new Thread(this);
        th.start();
    }
    public void run()
    {
        synchronized(SIob)
        {
            SIob.calcSI(P, T);
        }
        
    }
}
class Syn
{
    public static void main(String[] args) {
        SimpleInt siob=new SimpleInt();
        Deposits d1=new Deposits(siob, 1000, 1);
        Deposits d2=new Deposits(siob, 10000, 1);
        Deposits d3=new Deposits(siob, 100000, 1);
        try
        {
            d1.th.join();
            d2.th.join();
            d3.th.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}