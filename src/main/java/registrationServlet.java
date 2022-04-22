import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

import com.lists.cart;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "registrationServlet", value = "/registrationServlet")
public class registrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username-registration");
        String email = request.getParameter("email-registration");
        String password = request.getParameter("password-registration");
        String repassword = request.getParameter("re-password");
        
        if(password.equals(repassword)){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerceConnection", "root", "1234");
                Statement st = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user_table(emailid,name,password) VALUES (?,?,?)");

                preparedStatement.setString(1,email);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, password);
                preparedStatement.execute();
                HttpSession session= request.getSession();
                /*List<cart>cartList = new ArrayList<cart>();
                session.setAttribute("cart_lists",cartList);*/
                session.setAttribute("user",email);
                session.setAttribute("name",name);
                response.sendRedirect("productList.jsp");
            /*PrintWriter out= response.getWriter();
            out.println("hi");*/
            }catch(SQLException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            request.setAttribute("alerting","please enter correctly");
            request.getRequestDispatcher("registration.jsp").forward(request,response);
        }
        
        
        
    }

}
