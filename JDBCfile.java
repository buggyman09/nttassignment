import java.sql.*;

public class qns {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "ankit";
		String password = "g";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM test ");
		
		System.out.println("Query execution" + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("subject")+ " : " +  rs.getString("marks"));
		}
		con.close();

	}

}
