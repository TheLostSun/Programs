class CMD_AmicableNumbers
{
    public static void main(String args[])
    {
        int flag1=0,flag2=0;
        if(args.length!=2)
        {
            System.out.println("Enter only 2 numbers");
            System.exit(0);
        }
        else if(args.length==2)
        {
            try{
            int first=Integer.parseInt(args[0]);
            int second=Integer.parseInt(args[1]);
            for(int i=1;i<first;i++)
            {
                if(first%i==0)
                {
                    flag1=flag1+i;
                }
            }
            for(int j=1;j<second;j++)
            {
                if(second%j==0)
                {
                    flag2=flag2+j;
                }
            }
            if(flag1==second&&flag2==first)
            {
                System.out.println("Amicable Numbers");
            }
            else
            {
                System.out.println("Not Amicable Numbers");
            }
        }
        catch(NumberFormatException obj)
        {
            System.out.println("Enter only Integers");
            System.exit(0);
        }

        }
    }
}