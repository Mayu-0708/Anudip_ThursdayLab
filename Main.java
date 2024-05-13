//1. Define Product class with name, price,  and sort it price wise (use comparable interface) .
package Thrusday_Lab_15Feb;
import java.util.*;
 class Product implements Comparable<Product>
{
	 //Creating Array List
	ArrayList<Product> ProductList = new ArrayList<>();
	String Name;
	int Price;
	//constructor to initialise Name and Price
	public Product(String Name, int Price)
	{
		this.Name = Name;
		this.Price = Price;
	}
	
	//Compare to method
	@Override
	public int compareTo(Product obj)
	{
		return Integer.compare(this.Price, obj.Price);
	}
}

public class Main
{
	ArrayList<Product> ProductList = new ArrayList<>();
	String Name;
	int Price;
	//Accepting Name and Price of Product
	public void Accept()
	{
		int Quantity,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Products You Want : ");
		Quantity = sc.nextInt();
		
		for(i = 0; i < Quantity; i++)
		{
			System.out.println("Enter Product Name : ");
			Name = sc.next();
			
			System.out.println("Enter Product Price : ");
			Price = sc.nextInt();
			
			Product product = new Product(Name,Price);
			ProductList.add(product);
		}
	}
	
	//Methode for display Details
	public void Display()
	{
		int i = 0;
		Collections.sort(ProductList);
		Iterator<Product> itr = ProductList.iterator();
		System.out.println("Display Details : ");
		System.out.println("______________________________________________");
		System.out.println("Name\t\tPrice");
		
		while(itr.hasNext())
		{
			Product product = itr.next();
			System.out.println((i+1)+"."+product.Name+"\t\t"+product.Price);
			i++;
		}
	}
	public static void main(String[] args)
	{
		//Creating Object of Main Method
		Main  obj = new Main();
		obj.Accept();
		obj.Display();
		
	}
}
