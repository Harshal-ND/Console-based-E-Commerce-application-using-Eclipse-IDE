package Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class login_class {

	
	public void login() {
		
		try
		{	
			Product_class p1=new Product_class();
			
			 String c_id;
			 String c_password;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Please type your user ID");
			 c_id=sc.next();
			 System.out.println("Please enter your password");
			 c_password=sc.next();
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project","root", "");
			PreparedStatement ps=con.prepareStatement("Select c_id , c_password  from customer_login_info where c_id=? and c_password=?");
			ps.setString(1, c_id);
			ps.setString(2, c_password);
			ResultSet rs=ps.executeQuery();

							
			if (rs.next())
			{
			
				if(c_id.equals(rs.getString(1)) && c_password.equals(rs.getString(2)))

					{
						System.out.println("*****************************************************************");
						System.out.println("Login Successful");
						System.out.println("*****************************************************************");
						Thread.sleep(100);
						p1.product_list();
						
					}
			}
				else
				{
					System.out.println(" ");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println(" User id and Password combination is incorrect ");
				System.out.println(" ");
				System.out.println(" ");
				login();
				}
		
			
			
			
		}	
			
			

		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
