package Thrusday_lab_DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAuthorDetails 
{
	public void displayAuthorDetails()
	{
		try 
		{
			String url="jdbc:mysql://localhost:3306/anudip";
			String username="root";
			String passwrd="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection(url,username ,passwrd );
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from Author");
			
			System.out.print("\nA_Id\tName\tGmail\tPhone\n");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
