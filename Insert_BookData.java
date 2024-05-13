package Thrusday_lab_DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_BookData 
{
	public void insertBookData()
	{
		String url="jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String passwrd="root";
		
		String query="insert into Book values (?,?,?,?)";
		Scanner input=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection(url,username ,passwrd );
			PreparedStatement ps=conn.prepareStatement(query);
			
			System.out.print("Book ID=");
			ps.setInt(1,input.nextInt());
			
			System.out.print("Book name=");
			ps.setString(2,input.next());
			
			System.out.print("Book quantity=");
			ps.setInt(3,input.nextInt());
			
			System.out.print("Book price=");
			ps.setDouble(4,input.nextDouble());
			
			ps.execute();
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}