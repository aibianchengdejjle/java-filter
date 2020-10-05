package filter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class listen implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println(httpSessionEvent.getSession().getId());
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Integer online =(Integer) servletContext.getAttribute("online1");
        if(online==null){
            online=new Integer(1);//装箱
        }else {
            int count;
            count=online.intValue();//拆箱
            online=new Integer(count+1);
        }
        System.out.println(online);
        servletContext.setAttribute("online1",online);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Integer online =(Integer) servletContext.getAttribute("online");
        if(online==null){
            online=new Integer(1);//装箱
        }else {
            int count;
            count=online.intValue();//拆箱
            online=new Integer(count-1);
        }
        servletContext.setAttribute("onlincount",online);
    }
}
