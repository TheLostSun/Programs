import java.util.*;
class ArrayExceptionHandling
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);  
            System.out.println("Enter the number of elements in the array");
            int a=sc.nextInt();
            System.out.println("Enter the elements in the array");
            int arr[]=new int[a];
            for(int i=0;i<arr.length;i++)
            {
                try
                {
                    arr[i]=Integer.parseInt(sc.next());
                }
                 catch(NumberFormatException obj)
                {
                System.out.println("Datatype do not match /NumberFormatException has occured");
                System.exit(0);
                }
            }
            try
            {
                System.out.println("Enter the index of the array element you want to access");
                int k=sc.nextInt();
                System.out.println("The array element at "+k+"="+arr[k]);
            }
           
            catch(ArrayIndexOutOfBoundsException obj2)
            {
                System.out.println("Index is out of range of the array/ArrayOutOfBoundsException has occured ");
                System.exit(0);
            } 

            finally
            {
                System.out.println("The array element has been successfully accessed");
            }
        
      
    }
}