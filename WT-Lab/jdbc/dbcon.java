import java.sql.*;

class dbcon {
    public static void main(String args[]) {
	try {
            Class.forName("oracle.jdbc.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.45.8.22:1523:orclit","scott","Tiger1234");
	    System.out.println("connection created");
	    Statement stmt=con.createStatement();
	    System.out.println("statement created");
	    String str="create table test23(name varchar2(10),password varchar2(20),email_id varchar2(20),phonenumber number)";
	    stmt.executeUpdate(str);
	    System.out.println("table created");
	    stmt.close();
	    con.close();    
	} catch(Exception e) {
	    System.out.println(e);
	}
    }
}