package Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Staff_edit_class {
	public void staff_edit()
	{
		System.out.println(" ");
		System.out.println("Please select to perform desired action");
		System.out.println(" ");
		System.out.println("*****************************************************************");
		System.out.println(" ");
		System.out.println("1. To add product");
		System.out.println("2. To update existing product");
		System.out.println("3. To remove existing product");
		System.out.println("4. To view all products");
		System.out.println("5. Go back to home page");
		System.out.println(" ");
		System.out.println("*****************************************************************");
		
		Scanner sc=new Scanner(System.in);
		int choice4=sc.nextInt();
		
		switch(choice4)
		{
		case 1:				try {
			
										Class.forName("com.mysql.cj.jdbc.Driver");
										Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
										PreparedStatement ps=con.prepareStatement("insert into product_list (p_name, p_type, p_sub_type, p_price, p_size) values (?,?,?,?,?)");
										System.out.println("Please enter the product name ");
										String p_name=sc.next();
										System.out.println("Please enter the product type ");
										String p_type=sc.next();
										System.out.println("Please enter the product sub type ");
										String p_sub_type=sc.next();
										System.out.println("Please enter the product price ");
										int p_price=sc.nextInt();
										System.out.println("Please enter the product size in kg or null ");
										double p_size=sc.nextDouble();
										
										ps.setString(1, p_name);
										ps.setString(2, p_type);
										ps.setString(3, p_sub_type);
										ps.setInt(4, p_price);
										ps.setDouble(5, p_size);
										
										int j=ps.executeUpdate();
										System.out.println("Successfully added items in product list");
										staff_edit();
			
								}
							catch(Exception e5)
								{
								System.out.println(e5);
								}
			
			
			
		break;
		
		case 2:					System.out.println(" ");
								System.out.println("Please select to perform desired update action");
								System.out.println(" ");
								System.out.println("*****************************************************************");
								System.out.println(" ");
								System.out.println("1. To edit product name");
								System.out.println("2. To edit product type");
								System.out.println("3. To edit product sub type");
								System.out.println("4. To edit product price");
								System.out.println("5. To edit product size");
								System.out.println("6. Go back");
								System.out.println(" ");
								System.out.println("*****************************************************************");
								
								Scanner sc1=new Scanner(System.in);
								int choice5=sc1.nextInt();
								switch(choice5)
								{
									case 1:		
										try {
											
											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
											PreparedStatement ps=con.prepareStatement("update product_list set p_name=? where p_code=? ");
											
											System.out.println("Please enter the product name ");
											String p_name=sc.next();
											System.out.println("Please enter the product Code");
											int p_code=sc.nextInt();
											
											
											ps.setString(1, p_name);
											ps.setInt(2, p_code);
											
											
											int j=ps.executeUpdate();
											System.out.println("Successfully updated item in product list");
											staff_edit();
				
									}
								catch(Exception e5)
									{
									System.out.println(e5);
									}
									
										break;
									case 2:
										try {
											
											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
											PreparedStatement ps=con.prepareStatement("update product_list set p_type=? where p_code=? ");
											
											System.out.println("Please enter the product type ");
											String p_type=sc.next();
											System.out.println("Please enter the product Code");
											int p_code=sc.nextInt();
										
											
											ps.setString(1, p_type);
											ps.setInt(2, p_code);
											
											
											int j=ps.executeUpdate();
											System.out.println("Successfully updated item in product list");
											staff_edit();
											
				
									}
								catch(Exception e5)
									{
									System.out.println(e5);
									}
										break;
									case 3:	try {
										
										Class.forName("com.mysql.cj.jdbc.Driver");
										Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
										PreparedStatement ps=con.prepareStatement("update product_list set p_sub_type=? where p_code=? ");
										
										System.out.println("Please enter the product sub type ");
										String p_sub_type=sc.next();
										System.out.println("Please enter the product Code");
										int p_code=sc.nextInt();
									
										
										ps.setString(1, p_sub_type);
										ps.setInt(2, p_code);
										
										
										int j=ps.executeUpdate();
										System.out.println("Successfully updated item in product list");
										staff_edit();
										
			
								}
							catch(Exception e5)
								{
								System.out.println(e5);
								}
										
											
										break;
									case 4:
										try {
											
											Class.forName("com.mysql.cj.jdbc.Driver");
											Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
											PreparedStatement ps=con.prepareStatement("update product_list set p_price=? where p_code=? ");
											
											System.out.println("Please enter the product price ");
											int p_price=sc.nextInt();
											System.out.println("Please enter the product Code");
											int p_code=sc.nextInt();
										
											
											ps.setInt(1, p_price);
											ps.setInt(2, p_code);
											
											
											int j=ps.executeUpdate();
											System.out.println("Successfully updated item in product list");
											staff_edit();
											
				
									}
								catch(Exception e5)
									{
									System.out.println(e5);
									}
										break;
									case 5:	try {
										
										Class.forName("com.mysql.cj.jdbc.Driver");
										Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
										PreparedStatement ps=con.prepareStatement("update product_list set p_size=? where p_code=? ");
										
										System.out.println("Please enter the product size");
										double p_size=sc.nextDouble();
										System.out.println("Please enter the product Code");
										int p_code=sc.nextInt();
									
										
										ps.setDouble(1, p_size);
										ps.setInt(2, p_code);
										
										
										int j=ps.executeUpdate();
										System.out.println("Successfully updated item in product list");
										staff_edit();
										
			
								}
							catch(Exception e5)
								{
								System.out.println(e5);
								}
										break;
									case 6:staff_edit();
										break;
									default: System.out.println("Invalid input");
									staff_edit();
									
					
								}
							
			break;
			
		case 3:					
								try {
									
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
									PreparedStatement ps=con.prepareStatement("delete from product_list where p_code=? ");
									
									
									System.out.println("Please enter the product Code");
									int p_code=sc.nextInt();
								
									
									
									ps.setInt(1, p_code);
									
									
									int j=ps.executeUpdate();
									System.out.println("Successfully deleted item from product list");
									staff_edit();
									
					
							}
						catch(Exception e5)
							{
							System.out.println(e5);
							}
			break;
		case 4:				
			
			
			
			try {
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
					System.out.println("Product_code" +"\t"+"Product_name"+"\t\t"+"Product_Type"+"\t\t"+"Product_Sub_Type"+"\t\t\t\t"+"Product_Price"+"\t\t\t\t"+"Product_Size");
					System.out.println(" ");
					System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(" ");
					while((rs.next())) 
					{
			
						
						System.out.println(rs.getInt(1)+ "\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+
								"\t\t\t"+rs.getString(4)+"\t\t\t\t\t"+rs.getInt(5)+"\t\t\t\t\t"+rs.getBigDecimal(6));
						
					
					}
					
					staff_edit();
				}
						
						catch(Exception e6)
						{
							System.out.println(e6);
						}
										
						break;
			
			
		case 5:		Register_class r2=new Register_class();
						r2.Registeration();
			break;
			
			
		default: System.out.println("Invalid input");
			staff_edit();
		
		
		
		
		}
		
		
	}

}
