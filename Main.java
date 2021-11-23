class Mythread extends Thread
{
    public void run()
    {
        try{
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            if(i==5)
            {
                Thread.sleep(5000);
            }
        }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        Mythread obj=new Mythread();
        obj.start();
    }
}