package com.qianmi.test;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2014/6/6.
 */
public class TestServlet extends HttpServlet {
//用于处理客户端发送的GET请求 　　


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("我是doPost()方法！用来处理post请求");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("这是Servlet的例子123123");
        out.println("</BODY>");
        out.println("</HTML>");

    }
}
