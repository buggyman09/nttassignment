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
		
		/*String createQuery="CREATE TABLE test(ID NUMBER(2),NAME VARCHAR(10), SUBJECT VARCHAR(10),MARKS NUMBER(20))";
		stmt.executeUpdate(createQuery);
		
		String insertQuery="insert into test(id, name , subject, marks) values (1, 'tina','english',30)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test(id, name , subject, marks) values (2, 'layla','english',45)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test(id, name , subject, marks) values (3, 'tom','english',48)";
		stmt.executeUpdate(insertQuery);
		insertQuery="insert into test(id, name , subject, marks) values (4, 'neha','english',50)";
		stmt.executeUpdate(insertQuery);*/
		
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM test ");
		
		System.out.println("Query execution" + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("subject")+ " : " +  rs.getString("marks"));
		}
		con.close();

	}

}
