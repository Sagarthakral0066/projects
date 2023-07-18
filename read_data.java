
// read the login table in java

import java.sql.*;
class read_data
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	read_data()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded.");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			System.out.println("Connection Established.");


			ps=con.prepareStatement("select * from login");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
			System.out.println(rs.getString(1));
			}
		}
		catch(Exception e)
		{	
		System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		new read_data();
	}
}
	
	










