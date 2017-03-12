package onlineForum;

//import java.sql.Connection;

public class Test {
	public static void main(String[] args){
		String sql="insert into USERS values('aman4841','aman','kazi','in','a@b.com','m')";
		StmtUpdate s=new StmtUpdate(sql);
		int i=0;
		i=s.update();
		if(i!=0){
			System.out.println("success");
		}
}
}