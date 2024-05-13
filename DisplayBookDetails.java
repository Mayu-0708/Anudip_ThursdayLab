package Thrusday_lab_DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayBookDetails 
{
	public void displayBookDetails()
	{
		try 
		{
			String url="jdbc:mysql://localhost:3306/anudip";
			String username="root";
			String passwrd="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection(url,username ,passwrd );
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from Book");
			
			System.out.print("\nB_Id\tName\t\tQuantity\tPrice\n");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getDouble(4));
			}
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
