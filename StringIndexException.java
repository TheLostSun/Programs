import java.util.*;
class StringIndexException
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word/string");
        String s=sc.next();
        try{
            System.out.println("Enter the index of string element you want to access");
            int k=Integer.parseInt(sc.next());
            char ch=s.charAt(k);
            System.out.println("Character at index value "+k+" is " + ch);
        }
        catch(NumberFormatException obj)
        {
            System.out.println("Index can only be an Integer / NumberFormatException is thrown");
            System.exit(0);
        } 
        catch(StringIndexOutOfBoundsException obj)
        {
            System.out.println("Index is out of the range of the inputted string / StringIndexOutOfBoundsException is thrown");
            System.exit(0);
        }
    }
}