

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("txtrollno"));
		String name=request.getParameter("txtname");
		int marks=Integer.parseInt(request.getParameter("txtmarks"));
		PrintWriter out=response.getWriter();
		/*out.println(rollno);
		out.println(name);
		out.println(marks);*/
		
		try {
			//Call Connection Method
				Connection con=DBConnection.getMyConnection();
			//Write sql command
				String str="Insert into student (rollno,name,marks) values(?,?,?)";
				//string str= "update student set marks=? where rollno=?"
				//String str="delete from student where rollno=?"
				//to execute query create object of preparedSatement
				PreparedStatement  ps=con.prepareStatement(str);
				ps.setInt(1,rollno );
				ps.setString(2, name);
				ps.setInt(3, marks);
				int ans =ps.executeUpdate();
				
				if(ans>0)
					out.println("Record inserted");
				else
					out.println("Record not inserted");
				con.close();
			
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
