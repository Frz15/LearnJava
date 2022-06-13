package com.itheima.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql:///learnSQL";
        String username = "frz";
        String password = "123qweASD";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "update stu set id =1 where id = 1";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        String sql2 = "select * from stu";
        boolean count2 = stmt.execute(sql2);

        System.out.println(count);
        System.out.println(count2);

        stmt.close();
        conn.close();

    }
}
