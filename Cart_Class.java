package Project_2;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart_Class {
							
	ArrayList<Integer> list1=new ArrayList<Integer>(5);		
	Scanner sc=new Scanner(System.in);
	public void cart() {
	
		
		
		System.out.println("**************************************************");
		System.out.println(" ");
		System.out.println("Type 'n'  to stop adding items in to the cart");
		
		System.out.println(" ");

		System.out.println("Please enter the product code to buy desired items");
		System.out.println("**************************************************");
		System.out.println(" ");
		
		try
		{
			
			while(sc.hasNextInt())
			{
				int code=sc.nextInt();
				list1.add(code);
			}

		}
		catch(Exception e6)
		{
			System.out.println(e6);
		}
		System.out.println("Products in your cart is :" +list1);
		bill();
	}	
			// BILL PRINTING
			
	
	public String bill() {
	
	try
			{System.out.println(" ");
			
			System.out.println(" ");
			System.out.println("-----------------------------------------------------------------");
			
			System.out.println("*******************      CAKE-O-LICIOUS       *******************");
			System.out.println("*******************        ༼ つ ◕_◕ ༽つ         *******************");
			System.out.println("*******************     Home Sweet Bakery     *******************");
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~INVOICE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(" ");
            System.out.println("GSTIN: 03HNDHD1319K598");
            System.out.println("Contact : +91 809888955@");
			
 
			System.out.println("Date :" +java.time.LocalDate.now());  
			System.out.println("Time :" +java.time.LocalTime.now()); 
			
	int k;
	int length =list1.size();
	double sum=0.0;
	double cgst;
	double sgst;
	double total;
	for (k=0;k<length;k++)
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
		PreparedStatement ps=con.prepareStatement("Select p_name, p_type, p_sub_type,p_price  from product_list where p_code=?");
		ps.setInt(1,list1.get(k) );
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\tProduct code      :" +list1.get(k));
		System.out.println("\t\tProduct name      :" +rs.getString(1));
		System.out.println("\t\tProduct type      :" +rs.getString(2));
		System.out.println("\t\tProduct sub type  :" +rs.getString(3) );
		System.out.println("\t\tPrice             :" +rs.getInt(4));
		
		
		sum=sum+rs.getInt(4);
		
		}
		
		
	}
	System.out.println(" ");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("\t\tTotal items in your cart is " +length);
	System.out.println("\t\tSub Total is :" +sum+"/-");
	cgst=0.09*sum;
	sgst=0.09*sum;
	System.out.println("\t\tCGST 9% : " +cgst);
	System.out.println("\t\tSGST 9% : " +sgst);
	total=sum+cgst+sgst;
	System.out.println("\t\tTotal Payable Amount :" +Math.round(total)+"/-");
	System.out.println(" ");
	
	System.out.println(" ");
	System.out.println("----------------------------------------------------------------");
	
	System.out.println("*****************           THANK YOU          *****************");
	System.out.println("*****************         ༼ つ ◕_◕ ༽つ           *****************");
	System.out.println("*****************      PLEASE VISIT AGAIN      *****************");
	
	System.out.println("----------------------------------------------------------------");
	
	
//							Scanner sc3=new Scanner(System.in);
//							System.out.println("Do you want invoice?");
//							System.out.println("y >>>> yes");
//							System.out.println("n >>>> no");
//							char choice5=sc3.next().charAt(0);
//							
//							switch(choice5)
//							{
//							case 'y':bill_print();
//								break;
//							case 'n':System.out.println("Thank You for Shopping");
//								System.exit(0);
//								break;
//								
//							default: System.out.println("Invalid Input");
//										System.exit(choice5);
//						
//							}
//	
	
	}
	catch(Exception e3)
	{
		System.out.println(e3);
	}
	sc.close();
	return null;
	
	}
	
//	public void bill_print() {
//	try
//	{
//		
//
//		File f=new File("D://IT//JAVA//Cake_cj_project//bill.txt");
//		FileOutputStream fout=new FileOutputStream(f);
//		
//		String invoice = (String)bill();
//		byte j[]=invoice.getBytes();
//		fout.write(j);
//		
//		
//	}
//	catch (Exception e8)
//	{
//		System.out.println(e8);
//	}
//	}
}

