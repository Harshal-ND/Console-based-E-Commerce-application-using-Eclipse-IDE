package Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Register_class {

	
	public void Registeration() {
		System.out.println("WELCOME TO CAKE-O-LICIOUS");
		login_class l1=new login_class();
		try
		{
			System.out.println("Are you a Customer or Staff");
			System.out.println("Please type");
			System.out.println("'c' ->>> Customer");
			System.out.println("'s'->>> Staff  ");
//			System.out.println("Please type 's' for Staff ");
			
			Scanner sc=new Scanner(System.in);
			// Taking input from user
			String staff_id;
			String staff_password;
			char input1=sc.next().charAt(0);
			
			switch(input1)
			{
			case 's': 	System.out.println("Please enter Staff id ");
						staff_id=sc.next();                        // Accepting id entered by staff member
						System.out.println("Please enter password");
						staff_password=sc.next();					// Accepting password entered by staff member
						
						if(staff_id.equals("staff@cakeolicious.com") && staff_password.equals("staff@123"))
						{
							System.out.println("Staff member Successfully logged in");
							System.out.println(" ");
							Staff_edit_class s2=new Staff_edit_class();
							s2.staff_edit();
						}
						else
						{
							System.out.println("*********************************************************");
							System.out.println(" ");
							System.out.println("Your Id and Password combination is incorrect !!");
							System.out.println("Please check it again and have a try !!");
							System.out.println(" ");
							System.out.println("*********************************************************");
							System.out.println(" ");
							Registeration();
						}
						
				break;
			
			case 'c':	 System.out.println("Already a member ?? Please sign up ");
						System.out.println("New member ?? Please Login ");
						System.out.println("'1' ->>>> signup");
						System.out.println("'2' ->>>> login");
						int input2 =sc.nextInt();
						switch(input2)
						{
						case 1:  	
							try {
							
							// Registering the drive
							Class.forName("com.mysql.cj.jdbc.Driver");
							
							// Creating Connection
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cj_project", "root", "");
							
							// Inserting the Values
							 PreparedStatement ps=con.prepareStatement("insert into customer_login_info(c_first_name,"
							 		+ "c_last_name, c_id, c_password, c_address, c_pincode) values (?,?,?,?,?,?)");
							
							 // Accepting values from the user
							 
							 
							 String c_first_name;
							 String c_last_name;
							 String c_id;
							 String c_password;
							 String c_address;
							 int c_pincode;
							 System.out.println("Please enter your first name");
							 c_first_name=sc.next();
							 System.out.println("Please enter your last name");
							 c_last_name=sc.next();
							 System.out.println("Please type yout user ID");
							 c_id=sc.next();
							 System.out.println("Please enter your password");
							 c_password=sc.next();
							 System.out.println("Please enter your address");
							 c_address=sc.next();
							 System.out.println("Please enter your pincode");
							 c_pincode=sc.nextInt();
							 
							
							 ps.setString(1, c_first_name);
							 ps.setString(2, c_last_name);
							 ps.setString(3, c_id);
							 ps.setString(4, c_password);
							 ps.setString(5, c_address);
							 ps.setInt(6, c_pincode);
							 
							 int i=ps.executeUpdate();
							 System.out.println("Registeration done successfully");
							 System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
							 System.out.println(" ");
							 System.out.println("Please login to enjoy shopping");
							 System.out.println(" ");
							 l1.login();
							
						}
						catch(Exception e)
						{
							
							System.out.println(e);
						}
							break;
						
						case 2:
									l1.login();
						
				break;
				
		
		default: System.out.println("Invalid input");
					System.out.println("Please check again and try!!");
					Registeration();
						
						}}}
			
									
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	}


