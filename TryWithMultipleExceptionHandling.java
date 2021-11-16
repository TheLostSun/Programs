import java.util.*;
public class TryWithMultipleExceptionHandling
{
    public static void main(String args[])
    {
        int a;
        int b;
        int arr[]={12,13,14,15,16};
        int index;
        try(Scanner s=new Scanner(System.in))
        {
            a=s.nextInt();
            b=s.nextInt();
            index=s.nextInt();
            System.out.println(a/b);
            System.out.println(arr[index]);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | InputMismatchException obj)
        {
            System.out.println(obj.getClass().getName());
        }
        finally
        {
            System.out.println("Finally Block");
        }
        System.out.println("End Of the main method");
    }
}