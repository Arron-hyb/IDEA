package com.HT.Servlet.Learn01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class Request extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> h = req.getHeaderNames();
//        while(h.hasMoreElements()){
//            System.out.println(h.nextElement()+":"+req.getHeader(h.nextElement()));
//        }
        String uname = req.getParameter("uname");
        System.out.println("uname : "+uname);
        String psw = req.getParameter("password");
        System.out.println("psw : "+psw);
    }
}
