import java.util.Scanner;
class ArrayCondition1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=Integer.parseInt(sc.next());
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(sc.next());
        }
        System.out.println("Enter element to search");
        int o=sc.nextInt();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==o)
            {
                System.out.println("Number present at index = "+j);
                break;
            }
        }
    }
}