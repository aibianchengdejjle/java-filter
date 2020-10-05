package filter;

import javax.servlet.*;
import java.io.IOException;

public class filter implements Filter {
    //服务器启动之前他已经就启动了 他要随时等待
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("已经初始化了");
    }
    //chain 是链的意思 起一个放行的作用
    /*
    *   过滤中的所有代码 在过滤特定请求都会运行
    *  但是必须要写chain
    *
    * */
    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain filterChain) throws IOException, ServletException {
        Request.setCharacterEncoding("utf-8");
        Response.setCharacterEncoding("utf-8");
        Response.setContentType("text/html;charset=UTF-8");
        System.out.println("执行前");
        filterChain.doFilter(Request,Response);//让我们的请求继续走 如果不写程序到这里就被拦截
        System.out.println("执行后");
    }

    @Override
    public void destroy() {
        System.out.println("已经销毁了");
    }
}
