import java.sql.*;
import java.util.regex.*;
import java.util.*;
public class Internal
{
    public static void main(String ars[])throws ClassNotFoundException,SQLException
    {
        long phoneNo=0;
        String nameOfPerson="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/internal","root","");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Phone Number :");
        String phone=sc.nextLine();
        System.out.println("Enter Name");
        String name=sc.nextLine();
        Pattern p1 = Pattern.compile("\\b(0|91)?[6-9][0-9]{9}\\b");
        Matcher m1=p1.matcher(phone);
        boolean a = m1.matches();
        Pattern p2 = Pattern.compile("\\b[Aa][A-Za-z]+\\b");
        Matcher m2=p2.matcher(name);
        boolean b=m2.matches();
        while(a)
        {
            phoneNo=Long.parseLong(m1.group());
            st.executeUpdate("INSERT INTO info(ContactNumber) VALUES(phoneNo)");
        }
        ResultSet rs=st.executeQuery("SELECT * FROM info");
        while (rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getInt(2));
        }
        con.close();
    }
}