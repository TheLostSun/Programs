package jdbcdemo;

import java.sql.*;
public class  NewClass{
	public static void main(String args[]) throws SQLException,ClassNotFoundException
	{
		try{
		// Load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Obtain a connection
		Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/shuru", "root", "");

		// Obtain a statement
		Statement st = con.createStatement();

		// Execute the query
		ResultSet rs = st.executeQuery("SELECT * FROM TABLE1");
	    while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2));  

		// Closing the connection as per the
		// requirement with connection is completed
        con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
}// class
