package Thrusday_lab_DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertAuthorData 
{
	public void insertAuthorData()
	{
		String url="jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String passwrd="root";
		
		String query="insert into Author values (?,?,?,?)";
		Scanner input=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection(url,username ,passwrd );
			PreparedStatement ps=conn.prepareStatement(query);
			
			System.out.print("Author ID=");
			ps.setInt(1,input.nextInt());
			
			System.out.print("Author name=");
			ps.setString(2,input.next());
			
			System.out.print("Author Gmail=");
			ps.setString(3,input.next());
			
			System.out.print("Author Phone no=");
			ps.setString(4,input.next());
			
			ps.execute();
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
