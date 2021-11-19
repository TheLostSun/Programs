import java.util.Scanner;
class OneAndFourArray
{
    public static void main(String args[])
    {
        int flag=0;
        if(args.length<1)
        {
            System.exit(0);
        }
        for(int i=0;i<args.length;i++)
        {
            int h=Integer.parseInt(args[i]);
            if(h==1||h==4)
            {
                flag++;
            }
        }
        if(flag==args.length)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}