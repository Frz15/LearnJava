package com.itheima.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTransactionDemo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql:///learnSQL";
        String username = "frz";
        String password = "123qweASD";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();

        String sql = "update stu set score = 80.2 where id = 1";
        String sql2 = "drop table tb";

        try{
            conn.setAutoCommit(false);
            int count = stmt.executeUpdate(sql);
            int result = stmt.executeUpdate(sql2);

            System.out.println(count);
            System.out.println(result);
            conn.commit();
        }catch (Exception throwables){
            throwables.printStackTrace();
            conn.rollback();
        }


        stmt.close();
        conn.close();

    }
}
