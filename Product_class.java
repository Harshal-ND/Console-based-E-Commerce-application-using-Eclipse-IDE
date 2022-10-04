package Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Product_class {
	
	public void product_list()
	{
		
		
		
		System.out.println(" ");
		System.out.println("Please select to view itenaries");
		System.out.println(" ");
		System.out.println("*****************************************************************");
		System.out.println(" ");
		System.out.println("1. All");
		System.out.println("2. CAKES");
		System.out.println("3. PASTERY");
		System.out.println("4. BAKERSWARE");
		System.out.println("5. GO BACK TO HOME PAGE");
		System.out.println(" ");
		System.out.println("*****************************************************************");
		
		Scanner sc=new Scanner(System.in);
		int select=sc.nextInt();
		
		
		switch(select)
		{
		case 1: 
			try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from product_list");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("********************************************                           ****************************************************");
			System.out.println("*******************************************          ALL ITEMS         ****************************************************");
			System.out.println("*******************************************                            ****************************************************");
			System.out.println(" ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Product_code" +"\t"+"Product_name"+"\t\t"+"Product_Type"+"\t\t"+"Product_Sub_Type"+"\t\t\t\t"+"Product_Price"+"\t\t\t\t"+"Product_Size");
			System.out.println(" ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			while((rs.next())) 
			{

				
				System.out.println(rs.getInt(1)+ "\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+
						"\t\t\t"+rs.getString(4)+"\t\t\t\t\t"+rs.getInt(5)+"\t\t\t\t\t"+rs.getBigDecimal(6));
				
			
			}
			System.out.println("*****************************************************************");
			System.out.println(" ");
			System.out.println(" 'm'--->>>> Search more items ");
			System.out.println(" ");
			System.out.println(" 'c'--->>>> Go to Cart ");
			System.out.println(" ");
			System.out.println("*****************************************************************");
			
							char choice2;
							choice2=sc.next().charAt(0);
							switch(choice2)
				
							{
								case 'm':product_list();
									break;
								case 'c': Cart_Class c1=new Cart_Class();
											c1.cart();
											
									break;
								default: System.out.println("Invalid input");
											product_list();
							}
			}
			catch(Exception e)
			{
			System.out.println(e);
		}
		
		break;
		
		case 2:
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from cakes");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("*******************************************                            ****************************************************");
			System.out.println("*******************************************          CAKES             ****************************************************");
			System.out.println("*******************************************                            ****************************************************");
			System.out.println(" ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("Product_code" +"\t"+"Product_name"+"\t"+"Product_Type"+"\t"+"Product_Sub_Type"+"\t"+"Product_Price"+"\t"+"Product_Size");
			while((rs.next()))
			{
				
				System.out.println(rs.getInt(1)+ "\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+
						"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getBigDecimal(6));
				
			}
			System.out.println("*****************************************************************");
			System.out.println(" ");
			System.out.println(" 'm'--->>>> Search more items ");
			System.out.println(" ");
			System.out.println(" 'c'--->>>> Go to Cart ");
			System.out.println(" ");
			System.out.println("*****************************************************************");
			
							char choice2;
							choice2=sc.next().charAt(0);
							switch(choice2)
				
							{
								case 'm':product_list();
									break;
								case 'c': Cart_Class c1=new Cart_Class();
											c1.cart();
											
									break;
								default: System.out.println("Invalid input");
								product_list();
							}
			
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		
			break;
		case 3: 
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from pasteries");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("********************************************                           ****************************************************");
			System.out.println("*******************************************          PASTERIES         ****************************************************");
			System.out.println("*******************************************                            ****************************************************");
			System.out.println(" ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("Product_code" +"\t"+"Product_name"+"\t"+"Product_Type"+"\t"+"Product_Sub_Type"+"\t"+"Product_Price"+"\t"+"Product_Size");
			while((rs.next()))
			{
				
				System.out.println(rs.getInt(1)+ "\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+
						"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getBigDecimal(6));
				
			}
			System.out.println("*****************************************************************");
			System.out.println(" ");
			System.out.println(" 'm'--->>>> Search more items ");
			System.out.println(" ");
			System.out.println(" 'c'--->>>> Go to Cart ");
			System.out.println(" ");
			System.out.println("*****************************************************************");
			
							char choice2;
							choice2=sc.next().charAt(0);
							switch(choice2)
				
							{
								case 'm':product_list();
									break;
								case 'c': Cart_Class c1=new Cart_Class();
											c1.cart();
											
									break;
								default: System.out.println("Invalid input");
								product_list();
							}
			
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			break;
		case 4: 
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from bakerswares");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("*******************************************                            ****************************************************");
			System.out.println("*******************************************          BAKERSWARES       ****************************************************");
			System.out.println("*******************************************                            ****************************************************");
			System.out.println(" ");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("Product_code" +"\t"+"Product_name"+"\t"+"Product_Type"+"\t"+"Product_Sub_Type"+"\t"+"Product_Price"+"\t"+"Product_Size");
			while((rs.next()))
			{
				
				System.out.println(rs.getInt(1)+ "\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+
						"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getBigDecimal(6));
				
			}
			System.out.println("*****************************************************************");
			System.out.println(" ");
			System.out.println(" 'm'--->>>> Search more items ");
			System.out.println(" ");
			System.out.println(" 'c'--->>>> Go to Cart ");
			System.out.println(" ");
			System.out.println("*****************************************************************");
			
							char choice2;
							choice2=sc.next().charAt(0);
							switch(choice2)
				
							{
								case 'm':product_list();
									break;
								case 'c': Cart_Class c1=new Cart_Class();
											c1.cart();
											
									break;
								default: System.out.println("Invalid input");
								product_list();
							}
			
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			break;
		case 5:		 Register_class R1=new Register_class();
					R1.Registeration();
			break;
		
		default: System.out.println("Invalid input");
		product_list();// switch case close
		
		
		}
		
		
		
		
		
		
		
	}

}
