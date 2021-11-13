import java.util.*;
class Prime_Factorial_Fibonacci
{
    public void Fibonacci()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci Series");
        int count=sc.nextInt();
        int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2);//printing 0 and 1    
    
    for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
    {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
    }    
  
    }
    public void Prime()
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the number to check if it is prime or not");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                flag++;
            }
        }
        if(flag==2)
        {
            System.out.println("Prime Number");
        }
        else 
        {
            System.out.println("Not a Prime Number");
        }
    }
    public void Factorial()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get its factorial");
        int n=sc.nextInt();
        int flag=1;
        for(int i=1;i<=n;i++)
        {
            flag=flag*i;    
        }
        System.out.println("Factorial="+flag);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Prime_Factorial_Fibonacci obj=new Prime_Factorial_Fibonacci();
        System.out.println("Enter 1 for Fibonacci,2 for Prime,3 for Factorial,Any other number for exit");
        int n=sc.nextInt();
        if(n==1)
        {
            obj.Fibonacci();
        }
        else if(n==2)
        {
            obj.Prime();
        }
        else if(n==3)
        {
            obj.Factorial();
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}