package com.HT.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * Service请求处理代码流程:
         *  1.设置响应编码
         *  2.获取请求数据
         *  3.处理请求数据
         *     数据库处理
         *  4.响应处理结果
         */
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("你好 ");
    }
}
