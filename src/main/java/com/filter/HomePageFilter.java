package com.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomePageFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("进入拦截器请求");
        System.out.println("请求地址是:"+request.getServletPath());
        String path = request.getServletPath();
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
