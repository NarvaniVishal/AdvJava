package demo;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

			conn = DriverManager.getConnection("jdbc:mysql://128.66.203.247/B22CSE1", "B22CSE1", "sumo@123");
			
			String strQuery="insert into demo values(1,'kavish')";
//			Statement st = conn.createStatement();
//			st.executeUpdate(strQuery);
			System.out.print(conn);
			
			String strSelectQuery = "select * from demo";
			
			Statement st = conn.createStatement();
			
			ResultSet rs =  st.executeQuery(strSelectQuery);
			while(rs.next())
			{
				System.out.println("----------------");
				System.out.print(rs.getInt("no") + " : ");
				System.out.println(rs.getString("name"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}

//For Ubuntu:
//mysql -h 128.66.203.247 -u B22CSE1 -psumo@123 
//
//For Mac:
///usr/local/mysql/bin/mysql -h 128.66.203.247 -u B22CSE1 -psumo@123
