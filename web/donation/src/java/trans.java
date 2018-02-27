import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 class trans extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s1=request.getParameter("t1");
        String s2=request.getParameter("t2");
        int a=Integer.parseInt(request.getParameter("t3"));
        PreparedStatement ps;
        Connection con;
                   PrintWriter out=response.getWriter();
         try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
            ps=con.prepareStatement("update users set credit=credit-? where name=?");
            ps.setInt(1, a);
            ps.setString(2,s1);
            ps.executeUpdate();
            ps=con.prepareStatement("update users set credit=credit+? where name=?");
            ps.setInt(1, a);
            ps.setString(2, s2);
            ps.executeUpdate();
            out.println("plm");
        }
         catch(Exception e){
         out.println(e);
         }
    }
}