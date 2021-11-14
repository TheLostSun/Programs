import java.util.*;
class SquareOfNumber
{
    static void Square(int a)
    {
        int sq=a*a;
        System.out.println("Square"+sq);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter A Number");
            int n=Integer.parseInt(sc.next());
            Square(n);
        }
        catch(NumberFormatException obj)
        {
            System.out.println("Entered input is not a valid format for an integer.");
            System.exit(0);
        }
        finally
        {
            System.out.println("The work has been done successfully.");
        }
    }
}