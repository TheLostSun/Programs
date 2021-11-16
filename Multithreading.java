/*Multithreading-There is only one thread and that thread is having various sub threads within itself.Thread is a lightweighted sub process of the main process.
                    Utilized at programmatical level.
//Multiprocessing- Multiple processes executing at a particular time. Utilized at Operating Systems level. */
public class Multithreading
{
    public static void main(String args[])
    {
        Thread obj=Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("Prabhu");
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());
        System.out.println(obj.getPriority());
        System.out.println(obj.isDaemon());//Low priority threads are known as Daemon threads .
    }
}

//how to create multithreaded application
//two ways to create multithreaded application
//by extending the Thread class
//by implementing  the Runnable interface
//it is known as Functional interface
//one method
//run() method
//lamda expression
