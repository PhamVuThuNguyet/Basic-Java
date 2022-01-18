package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Vector;

public class StudentView extends JFrame {
    JFrame jFrame = new JFrame("StudentView");


    public void ViewStudent() throws SQLException, ClassNotFoundException {
        // get data
        Connection connection = connect();
        String sql = "SELECT * FROM Students";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int column_count = resultSetMetaData.getColumnCount();
        Vector vector_title = new Vector(column_count);
        for(int i = 0; i < column_count; i++){
            vector_title.add(resultSetMetaData.getColumnLabel(i + 1));
        }
        Vector vector_data = new Vector(50, 50);
        while(resultSet.next()){
            Vector row = new Vector(column_count);
            for(int i= 0; i < column_count; i++){
                row.add(resultSet.getString(i));
            }
            vector_data.add(row);
        }

        // table
        JTable jTable = new JTable(vector_data, vector_title);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.setContentPane(jScrollPane);
        jFrame.pack();
        setVisible(true);
    }

    public Connection connect() throws SQLException, ClassNotFoundException {
        String sqlServer = "jdbc:sqlserver://localhost:1433;databaseName=Student;user=sa;password=12345";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection(sqlServer);
        System.out.println("Connected Successfully");
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentView studentView = new StudentView();
        studentView.ViewStudent();
    }
}
