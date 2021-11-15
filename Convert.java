import java.util.*;

    class Convert
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            try{

            
            System.out.println("Enter a number");
            double a=sc.nextDouble();
            System.out.println(a);
            }
            catch(Exception obj)
            {
                System.out.println(obj);
                System.exit(0);
            }
        }
    }
