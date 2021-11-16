import java.util.*;
public class LabExperiment3
{
    public void m1()throws InterruptedException
    {
        m2();
    }
    public void m2()throws InterruptedException 
    {
        /* throws only works with Checked Exceptions like InterruptedException or the program will end abruptly */
        Thread.sleep(1000);
        /*throws will not seperately work with Unchecked Exceptions like ArithmeticException*/
    }
    public static void main(String args[])throws InterruptedException
    {
        LabExperiment3 obj=new LabExperiment3();
        obj.m1();
        System.out.println("End of the main method");
    }
}