package Thrusday_lab_DBMS;

import java.util.Scanner;

public class BookAuthor 
{
	Insert_BookData insertBook=new Insert_BookData();
	Modify_Book modifyBook=new Modify_Book();
	DisplayBookDetails displayBook=new DisplayBookDetails();
	Delete_Book deleteBook=new Delete_Book();
	
	InsertAuthorData insertAuthor=new InsertAuthorData();
	ModifyAuthor modifyAuthor=new ModifyAuthor();
	DisplayAuthorDetails displayAuthor=new DisplayAuthorDetails();
	DeleteAuthor deleteAuthor=new DeleteAuthor();
	
	int Mainchoice,choice;
	
	public void choices()
	{
		Scanner input=new Scanner(System.in);
		do
		{
			System.out.print("\n------ OPERATIONS ------\n"
					+ "1) Insert\n"
					+ "2) Modify\n"
					+ "3) Delete\n"
					+ "4) View all\n"
					+ "5) Exit\n"
					+ "choose Operation=");
			Mainchoice=input.nextInt();
			switch(Mainchoice)
			{
				case 1:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						insertBook.insertBookData();
					if(choice==2)
						insertAuthor.insertAuthorData();
					else
						System.out.println("Not Valid");
					break;
					
				case 2:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						modifyBook.modifyBookData();
					if(choice==2)
						modifyAuthor.modifyAuthorData();
					else
						System.out.println("Not Valid");
					break;
					
				case 3:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						deleteBook.deleteBookDetails();
					if(choice==2)
						deleteAuthor.deleteAuthorDetails();
					else
						System.out.println("Not Valid");
					break;
					
				case 4:
					System.out.print("1) Book\n2) Author\nEnter=");
					choice=input.nextInt();
					if(choice==1)
						displayBook.displayBookDetails();
					if(choice==2)
						displayAuthor.displayAuthorDetails();
					else
						System.out.println("Not Valid");
					break;
					
				case 5:
					System.exit(0);
					break;
			}
		}while(true);
	}
	
	public static void main(String[] args)
	{
		BookAuthor obj=new BookAuthor();
		obj.choices();
	}

}
