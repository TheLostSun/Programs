import java.util.Scanner;
class OOPSArraySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        OOPSArraySearch obj=new OOPSArraySearch();
        System.out.println("Enter the size of array");
        int n=Integer.parseInt(sc.next());
        System.out.println("Enter array elements ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(sc.next());
        }
        System.out.println("Enter the element to search");
        int p=Integer.parseInt(sc.next());
        if(obj.search(arr,p)==true)
        {
            System.out.println("True");
        }
        else if(obj.search(arr,p)==false)
        {
            System.out.println("Element not found");
        }
        
    }
    public boolean search(int arr[],int element)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==element)
            {
                return true;
            }
            
        }
        return false;
    }
}