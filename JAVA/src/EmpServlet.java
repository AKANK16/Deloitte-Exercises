
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Employee emp;
	PrintWriter pw;
    EmployeeDBObject dbo;
    
    
    public EmpServlet() {
        super();
        dbo=new EmployeeDBObject();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			pw=response.getWriter();
			int eid=Integer.parseInt(request.getParameter("eid"));
			ResultSet res=dbo.retrieve(eid);
			
			pw.println("<table border=3><tr><th>Employee Id</th><th>Employee Name</th><th>Mobile No</th><th>Address</th><th>Department</th></tr>");

			while(res.next())
			{
				pw.println("<tr>");
				pw.println("<td>"+res.getInt("eid")+"</td>");
				pw.println("<td>"+res.getString("name")+"</td>");
				pw.println("<td>"+res.getString("mobile")+"</td>");
				pw.println("<td>"+res.getString("address")+"</td>");
				pw.println("<td>"+res.getString("dept")+"</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");	
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		pw=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String dept=request.getParameter("dept");
		
		emp=new Employee(eid,name,mobile,address,dept);
		int ra=dbo.insert(emp);
		if(ra>0)
			pw.println("<font color=green>Employee Details Inserted Succcessfully.</font>");
		else
			pw.println("<font color=red>Employee Details are not inserted.</font>");
		pw.println("To Go Back To The Form <a href='http://localhost:9090/EmployeeManagementSystem/home.html'>Click Here</a>");
	}
}
