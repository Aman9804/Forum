package onlineForum;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StmtQuery {
String sql="";
StmtQuery(String a){
	sql=a;
}
Conn c=new Conn();
Connection con=c.Con("forum", "1234");
public ResultSet Ex(){
	ResultSet r = null;
	try {
		Statement s=con.createStatement();
		r=s.executeQuery(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return r;
}
}
