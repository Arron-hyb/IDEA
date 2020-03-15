package com.HT.Dao.Impl;

import com.HT.Dao.LoginDao;
import com.HT.pojo.User;

import java.sql.*;

public class LoginDaoImpl implements LoginDao {
    @Override
    public User checkLoginDao(String uname, String pwd) throws ClassNotFoundException {
        //声明JDBC对象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/servlet?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
            //获取连接对象
            conn = DriverManager.getConnection(url,"root","19990123");
            //创建sql语句
            String sql = "select * from t_user where uname=? and pwd=?";
            //创建sql命令对象
            ps = conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1,uname);
            ps.setString(2,pwd);
            //执行
            rs = ps.executeQuery();
            while(rs.next()){
                u = new User();
                u.setUid(rs.getInt("uid"));
                u.setUname(rs.getString("uname"));
                u.setPassword(rs.getString("pwd"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //返回处理结果
        return u;
    }
}
