package filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
*
* */
public class destory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user_session = req.getSession().getAttribute("user_session");
        if(user_session!=null){
            req.getSession().removeAttribute("user_session");
            resp.sendRedirect("login.jsp");
        }else {
            resp.sendRedirect("login.jsp");
        }
    }
}
