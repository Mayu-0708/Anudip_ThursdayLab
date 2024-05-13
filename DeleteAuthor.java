package Thrusday_lab_DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteAuthor 
{
	public void deleteAuthorDetails()
	{
		int book_id;
		int count;
		String url="jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String passwrd="root";
		
		Scanner input=new Scanner(System.in);
		
		String query="delete from Author where A_id=?";
		System.out.print("Enter book id for deletion=");
		book_id=input.nextInt();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,username ,passwrd );
			
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1,book_id);
			count=ps.executeUpdate();
			if(count>0) 
			{
				System.out.println("Author Deleted");
			}
			else
			{
				System.out.println("Invalid ID\n First check the Author List");
			}
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
//		input.close();
	}
}
