class ThreadDemo1 extends Thread
{
    public void run()
    {
        System.out.println("DemoThread1 is Executing and it's priority is = "+Thread.currentThread().getPriority());
    }
}
class ThreadDemo2 extends Thread
{
    public void run()
    {
        System.out.println("DemoThread2 is Executing and it's priority is = "+Thread.currentThread().getPriority() );
    }
}
class ThreadDemo3 extends Thread
{
    public void run()
    {
        System.out.println("DemoThread3 is Executing and it's priority is = "+Thread.currentThread().getPriority());
    }
}
class ThreadHandler
{
    public static void main(String args[])
    {
        ThreadDemo1 t1=new ThreadDemo1();
        ThreadDemo2 t2=new ThreadDemo2();
        ThreadDemo3 t3=new ThreadDemo3();
        System.out.println("Currently executing Thread = "+Thread.currentThread().getName());
        t1.setPriority(6);
        t2.setPriority(7);
        t3.setPriority(8);
        t1.start();
        t2.start();
        t3.start();
    }
}