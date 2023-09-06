import java.util.*;

class Book
{
	//Attributes
	private String author;
	private int totalpages;
	private double price;
	private String dop;
	
	//Get set methods
	
	//Author
	public String getAuthor()
	{
		return this.author;
	}
	
	public void setAuthor(String name)
	{
		this.author = name;
	}
	
	
	//totalpages
	public int getTotalPages()
	{
		return this.totalpages;
	}
	
	public void setTotalPages(int pgs)
	{
		this.totalpages = pgs;
	}
	
	
	//price
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double pr)
	{
		this.price = pr;
	}
	
	
	//dop
	public String getDOP()
	{
		return this.dop;
	}
	
	public void setDOP(String dteY,String dteM,String dteD)
	{
		String dteF = ""+dteD+"/"+dteM+"/"+dteY+"";
		this.dop = dteF;
	}
	
}

class Demo
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			int numberOfBooks;
			
			System.out.print("\n");
			
			System.out.print("Enter the number of books: ");
			numberOfBooks = sc.nextInt();
			
			System.out.println("-------------------------------------------------");
			
			Book[] b = new Book[numberOfBooks];
			
			for(int i=0;i<numberOfBooks;i++)
			{
				System.out.println("\nBook "+i+":");
				
				b[i] = new Book();
				
				System.out.print("Enter the name of author: ");
				sc.nextLine();
				String tname = sc.nextLine();
				b[i].setAuthor(tname);
					
				System.out.print("Enter number of pages in book: ");
				int tpages = -1;
				while(tpages == -1)
				{
					try{
						tpages = sc.nextInt();
						break;	

					}catch(Exception e)
					{
						System.out.println("Enter a number only");
						sc.nextLine();
					}
				}
				
				b[i].setTotalPages(tpages);
					
				System.out.print("Enter the price of the book: ");
				double tprice = 0;
				while(true)
				{
					try{
						tprice = sc.nextDouble();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Enter a number only");
						sc.nextLine();
					}
				}
				b[i].setPrice(tprice);
				
				System.out.println("Enter the date of purchase");
				System.out.print("	Year of purchase: ");
				String tYear = sc.next();
				System.out.print("	Month of purchase: ");
				String tMonth = sc.next();
				System.out.print("	Day of purchase: ");
				String tDay = sc.next();
				b[i].setDOP(tYear,tMonth,tDay);
				
				System.out.println("------------------------------------");
			}
			
			System.out.println("\nThe data you entered is as follows:");
			
			for(int i=0;i<numberOfBooks;i++)
			{
				System.out.println("Book"+i+" :");
				System.out.println("Author: "+b[i].getAuthor());
				System.out.println("Price: "+b[i].getPrice());
				System.out.println("Total pages: "+b[i].getTotalPages());
				System.out.println("Date of Purchase: "+b[i].getDOP());
				
				System.out.println("------------------");
				
				System.out.println("\n");
			}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}