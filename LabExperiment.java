//wrapper classes
//exception handling
//multithreading
import java.util.*;
public class LabExperiment
{
    public static void main(String args[])
    {
        //try with resources
        try(Scanner sc=new Scanner(System.in))
        {
                int i=Integer.parseInt(sc.next());
        }
        catch(Exception obj)
        {
            obj.printStackTrace();
            //System.out.println(obj.getMessage());
        }
    }
}