import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import com.tektaurus.bean.Student;

public class EmployeeDBObject {

	Connection con;
	PreparedStatement pre;
	ResultSet res;
	
	public EmployeeDBObject()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public int insert(Employee em)

	{
		System.out.println("In Insert");
		int ra=0;
		try
		{
			pre=con.prepareStatement("insert into Empl values(?,?,?,?,?)");
			pre.setInt(1, em.getEid());
			pre.setString(2,em.getName());
			pre.setString(3, em.getMobile());
			pre.setString(4,em.getAddress());
			pre.setString(5, em.getDept());
			ra=pre.executeUpdate();
			pre.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
/*	public int update(Student s)

	{
		System.out.println("In Update");
		int ra=0;
		try
		{
			pre=con.prepareStatement("update S set name=?,mobile=?,address=?,stream=? where sid=?");
			pre.setInt(5, s.getEid());
			pre.setString(1,s.getName());
			pre.setString(2, s.getMobile());
			pre.setString(3,s.getAddress());
			pre.setString(4, s.getStream());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public int delete(int sid)

	{
		System.out.println("In Delete");
		int ra=0;
		try
		{
			pre=con.prepareStatement("delete from S where sid=?");
			pre.setInt(1, sid);
			
			ra=pre.executeUpdate();
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	
*/	
	public ResultSet retrieve(int eid)
	{
		System.out.println("In Retrieve");
		try
		{
			
			pre=con.prepareStatement("select * from Empl where eid=?");
			pre.setInt(1,eid);
			res=pre.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
}

