package com.filter;

import com.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomePageFilter implements Filter {
    private static final Logger LOGGER = LogManager.getLogger(HomePageFilter.class);
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String path = request.getServletPath();
        TestService ts = new TestService();
        ts.toTest2();
        LOGGER.info("获得的路径是:"+path);
        if(path.equals("/")){
            HttpServletResponse response = (HttpServletResponse)servletResponse;
            response.sendRedirect("/html/welcome.html");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }


    public void destroy() {

    }
}
