package filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //统计网站的登陆人数
        if(username.equals("admin")){
            req.getSession().setAttribute("user_session",req.getSession().getId());
//           这个地方其实就是域名注意要不要加斜杠的问题
            resp.sendRedirect("sys/success.jsp");
        }else {
            resp.sendRedirect("error.jsp");
        }
    }
}
