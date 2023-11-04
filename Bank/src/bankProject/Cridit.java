package bankProject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Cridit")
public class Cridit extends HttpServlet{
	
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	String mobile=req.getParameter("mobile");
    	String password=req.getParameter("password");
    	
    	String url="jdbc:mysql://localhost:3307?user=root&password=12345";
    	//if(amount>0)
    		String query="select * from teca41.bank where mobile=? and password=?";
    		try {
				Class.forName("com.mysql.jdbc.Driver");
    			Connection connection=DriverManager.getConnection(url);
    			PreparedStatement ps=connection.prepareStatement(query);
    			ps.setString(1, mobile);
    			ps.setString(2, password);
    			int number=ps.executeUpdate();
    			if(number>0) {
    				
    			}
    			
    			
    			
			} catch (Exception e) {
				// TODO: handle exception
			}
    	
    }
}
