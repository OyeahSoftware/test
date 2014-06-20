package com.qianmi.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2014/6/6.
 */
public class MyFilter implements Filter {

    private String charset = "utf-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("================================");
        System.out.println("Filter用的是["+charset+"]编码哦");
        System.out.println("================================");
        servletRequest.setCharacterEncoding(charset);
        servletResponse.setCharacterEncoding(charset);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }


}
