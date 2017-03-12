package onlineForum;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StmtQuery {
String sql="";
StmtQuery(String a){
	this.sql=a;
}
Conn c=new Conn();
Connection con=c.Con("forum", "1234");
public ResultSet retriveData(){
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

public boolean isExist(String a){
	boolean b=false;
	try {
		Statement s=con.createStatement();
		b=s.execute(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return b;
}
}
