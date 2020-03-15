package com.HT.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/servlet?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
            conn = DriverManager.getConnection(url,"root","19990123");
            System.out.println(conn);
            //创建sql语句
            String sql = "select * from t_user where uname=? and pwd=?";
            //创建sql命令对象
            ps = conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1,"zhangsan");
            ps.setString(2,"123");
            //执行
            rs = ps.executeQuery();
            while(rs.next()){
//                u = new User();
//                u.setUid(rs.getInt("uid"));
//                u.setUname(rs.getString("uname"));
//                u.setPassword(rs.getString("pwd"));
                int uid = rs.getInt("uid");
                String uname = rs.getString("uname");
                String pwd = rs.getString("pwd");
                System.out.println("Uid :"+uid+uname+pwd);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
