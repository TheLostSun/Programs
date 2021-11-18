class CommandLinePalindrome
{
    public static void main(String args[])
    {
        int temp,rev=0;
        if(args.length>1)
        {
            System.out.println("Please Enter a single number");
            System.exit(0);
        }
        else if(args.length==1)
        {
            try
            {
                int f=Integer.parseInt(args[0]);
                int l=f;
                while(f>0)
                {
                    temp=f%10;
                    rev=(rev*10)+temp;
                    f=f/10;
                }
                if(rev==l)
                {
                    System.out.println("Palindrome");
                }
                else
                {
                    System.out.println("Not Palindrome");
                }
            }
            catch(NumberFormatException obj)
            {
                System.out.println("Enter an integer only / NumberFormatException is raised");
                System.exit(0);
            }
            finally{
                System.out.println("Task Complete");
            }
        }
    }
}