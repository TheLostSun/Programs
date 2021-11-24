class Thread1 extends Thread{
        public void run()
        {
            for(int i=0;i<6;i++)
            {
                    System.out.println("Thread 1 is running");
                
            }
        }
}
class Thread2 extends Thread{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Thread 2 is running");
        }
    }
}
class ThreadExample2
{
    public static void main(String args[])
    {
        Thread1 obj1=new Thread1();
        Thread2 obj2=new Thread2();
        obj1.start();
        obj2.start();
        try
        {
            for(int i=0;i<3;i++)
            {
                obj1.yield();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
