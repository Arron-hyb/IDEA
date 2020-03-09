package com.HT.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class pageservlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
//        响应请求结果
        PrintWriter writer = resp.getWriter();
        writer.write("<html>");
        writer.write("<head>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<form action='login' method='post'>");
        writer.write("用户名:<input type='text' name='uname' value=''><br>");
        writer.write("密码:<input type='password' name='pwd' value=''><br>");
        writer.write("<input type='submit' value='登录'>");
        writer.write("</form>");
        writer.write("</body>");
        writer.write("</html>");
    }
}
