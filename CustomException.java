import java.util.*;
class InvalidValueException extends Exception
{
    InvalidValueException(String s)
    {
        super(s);
    }
}
class CustomException
{
    static void Average(int a,int b,int c,String name)throws InvalidValueException
    {
        if(a<0||b<0||c<0)
        {
            throw new InvalidValueException("Marks cannot be negative , try again");
        }
        else
        {
            double avg=((a+b+c)/3.0);
            System.out.println("Average marks of "+name+" = "+avg);
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of 1st student");
        String s1=sc.nextLine();
        System.out.println("Enter Name of 2nd Student");
        String s2=sc.nextLine();
        try{
        System.out.println("Enter marks in 3 subjects of 1st Student");
        int m1=Integer.parseInt(sc.next());
        int m2=Integer.parseInt(sc.next());
        int m3=Integer.parseInt(sc.next());
        Average(m1,m2,m3,s1);
        System.out.println("Enter marks in 3 subjects of 2nd Student");
        int n1=Integer.parseInt(sc.next());
        int n2=Integer.parseInt(sc.next());
        int n3=Integer.parseInt(sc.next());
        Average(n1,n2,n3,s2);
        }
        catch(InvalidValueException obj)
        {
            System.out.println("Marks Cannot be negative");
            System.exit(0);
        }
        catch(NumberFormatException obj)
        {
            System.out.println("Invalid value for marks / Only Integers allowed ");
            System.exit(0);
        }
        
    }
}