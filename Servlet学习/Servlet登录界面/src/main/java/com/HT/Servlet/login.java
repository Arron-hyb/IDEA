package com.HT.Servlet;

import com.HT.Service.Impl.LoginServiceImpl;
import com.HT.Service.LoginService;
import com.HT.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println(uname+":"+pwd);
        //处理请求信息
        LoginService ls = new LoginServiceImpl();
        User u = null;
        try {
            u = ls.checkLoginService(uname,pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //响应处理结果
        if(u!=null){
            resp.getWriter().write("登录成功");
        }else {
            resp.getWriter().write("登录失败");
        }

    }
}
