import java.util.*;
class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String rev="";
        char ch;
        System.out.println("Input a string");
        String s=sc.next();
        for(int i=s.length()-1;i>=0;i--)
        {
            ch=s.charAt(i);
            rev=rev+ch;

        }
        if(rev.equals(s))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }

    }
}