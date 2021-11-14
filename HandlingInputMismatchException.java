import java.util.*;
class HandlingInputMismatchException
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            try{
                System.out.println("Enter two numbers to get their sum");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int sum=a+b;
                System.out.println("Sum="+sum);
            }
            catch(InputMismatchException obj)
            {
                System.out.println("You can only input integers/ InputMismatchException is thrown and handled");
                System.exit(0);
            }
        }
}