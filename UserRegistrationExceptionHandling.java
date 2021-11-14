import java.util.*;
class InvalidCountryException extends Exception
{
    InvalidCountryException(String s)
    {
        super(s);
    }
}
class UserRegistrationExceptionHandling
{
    static void registerUser(String username,String userCountry)throws InvalidCountryException
    {
        if(userCountry.equalsIgnoreCase("India"))
        {
            System.out.println("User Registration done successfully");
        }
        else
        {
            throw new InvalidCountryException("InavlidCountryException");
            
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter User Name ");
        String name=sc.nextLine();
        System.out.println("Enter Country Name ");
        String country=sc.nextLine();
        registerUser(name,country);
        }
        catch(InvalidCountryException obj)
        {
                System.out.println("User Outside India cannot be registered");
                System.exit(0);
        }
    }
}