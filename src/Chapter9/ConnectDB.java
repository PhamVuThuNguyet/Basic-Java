package Chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {

    Connection conn;
    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String DB_URL = "jdbc:mysql://localhost:3306/studentmanage";
            String USER_NAME = "root";
            String PASSWORD = "";
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connected...");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public Connection connectSQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String DB_URL = "jdbc:mysql://localhost:3306/studentmanage";
            String USER_NAME = "root";
            String PASSWORD = "";
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connected...");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return conn;
    }

    public int executeDB(String sql) { //insert, update, delete
        int record = 0;
        try {
            connect();
            stmt = conn.createStatement();
            record = stmt.executeUpdate(sql); //so luong hang thay doi sau khi thuc hien 1 trong 3 cau lenh tren
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                stmt.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return record;
    }

    public int executeDBPrepare(String sql) { //insert, update, delete
        int record = 0;
        try {
            connect();
            ps = conn.prepareStatement(sql);
            record = ps.executeUpdate();
            //record = stmt.executeUpdate(sql); //so luong hang thay doi sau khi thuc hien 1 trong 3 cau lenh tren
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                stmt.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return record;
    }

    //truy xuat csdl
    public ResultSet ListAccount(String sql) {
        try {
            connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
                //stmt.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return rs;
    }

}

