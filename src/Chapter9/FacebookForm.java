package Chapter9;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Chapter9.ConnectDB;

import java.awt.CardLayout;
import java.util.Objects;


public class FacebookForm extends JFrame {
    JFrame f = new JFrame("The Frame");
    JLabel lbUser = new JLabel("Username");
    JTextField tfUser = new JTextField(10);
    JLabel lbPassword = new JLabel("Password");
    JPasswordField tfPass = new JPasswordField(10);
    //combobox
    JLabel lbDepart = new JLabel("Department");
    String[] department = {"Vietnam-Korea University", "Hue University", "Hanoi University"};
    JComboBox cboDepartment = new JComboBox(department);
    //checkbox
    JCheckBox cbCS = new JCheckBox("Computer Science");
    JCheckBox cbEconomic = new JCheckBox("Economic");

    JButton btnSignUp = new JButton("Sign Up");
    JButton btnChange = new JButton("Change Pass");
    JButton btnDelete = new JButton("Delete");
    JRadioButton rbMale = new JRadioButton("Male");
    JRadioButton rbFemale = new JRadioButton("Female");
    JButton btnList = new JButton("List");
    ButtonGroup br = new ButtonGroup();

    PreparedStatement ps;
    Connection conn;
    ResultSet rs;


    public FacebookForm() {
        //tao 1 container de add cac component vao
        // this.getContentPane().;
        f.setLocation(300, 300);
        f.setLayout(new GridLayout(7, 2));
        Container cont = f.getContentPane();
        //cont.setLayout(new LayoutManager());
        cont.add(lbUser);
        cont.add(tfUser);
        cont.add(lbPassword);
        cont.add(tfPass);
        br.add(rbMale);
        br.add(rbFemale);
        cont.add(rbMale);
        cont.add(rbFemale);
        //Hobbies : Game Music
        cont.add(lbDepart);
        cont.add(cboDepartment);
        cont.add(cbCS);
        cont.add(cbEconomic);
        cont.add(btnSignUp);
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConnectDB cn = new ConnectDB();
                String gender = "";
                if (rbMale.isSelected()) gender = rbMale.getText();
                else gender = rbFemale.getText();
                String depart = Objects.requireNonNull(cboDepartment.getSelectedItem()).toString();
                String faculty = "";
                if (cbCS.isSelected()) faculty += cbCS.getText() + ";";
                if (cbEconomic.isSelected()) faculty += cbEconomic.getText();
                //  int record = cn.executeDB("Insert into Account values('"+tfUser.getText()+"','"+tfPass.getText()+"','"+gender+"','"+depart+"','"+faculty+"')");
                String sql = "Exec sp_AddUser '" + tfUser.getText() + "','" + tfPass.getText() + "','" + gender + "','" + depart + "','" + faculty + "' ";
                // System.out.println(sql);
                //int record = cn.executeDB("Exec sp_AddUser1 '"+tfUser.getText()+"','"+tfPass.getText()+"','"+gender+"','"+depart+"','"+faculty+"' ");

                //dung preparestatement
                conn = cn.connectSQL();
                try {
                    ps = conn.prepareStatement("Exec sp_AddUser1 ?,?,?,?,?");
                    ps.setString(1, tfUser.getText());
                    ps.setString(2, tfPass.getText());
                    ps.setString(3, gender);
                    ps.setString(4, depart);
                    ps.setString(5, faculty);
                    int record = ps.executeUpdate();
                    if (record > 0) JOptionPane.showMessageDialog(null, "Success");
                    else JOptionPane.showMessageDialog(null, "Fail");
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }


            }
        });
        cont.add(btnChange);
        btnChange.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gender = "";
                if (rbMale.isSelected()) gender = rbMale.getText();
                else gender = rbFemale.getText();
                String depart = Objects.requireNonNull(cboDepartment.getSelectedItem()).toString();
                String faculty = "";
                if (cbCS.isSelected()) faculty += cbCS.getText() + ";";
                if (cbEconomic.isSelected()) faculty += cbEconomic.getText();
                ConnectDB connectDB = new ConnectDB();
                String sql = "CREATE PROCEDURE st_update @username varchar(50) AS UPDATE Account Set pass = ?, gender = ?, depart = ?, faculty = ? WHERE Username = ?";
                conn = connectDB.connectSQL();
                try {
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, tfPass.getText());
                    ps.setString(2, gender);
                    ps.setString(3, depart);
                    ps.setString(4, faculty);
                    ps.setString(5, tfUser.getText());
                    int no_row = ps.executeUpdate();
                    if (no_row > 0) {
                        System.out.println("A user is updated");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        cont.add(btnDelete);
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConnectDB connectDB = new ConnectDB();
//                String sql = "DELETE FROM Account WHERE Username = ? ";
                conn = connectDB.connectSQL();
//                try{
//                    ps = conn.prepareStatement(sql);
//                    ps.setString(1, tfUser.getText());
//                    int no_row = ps.executeUpdate();
//                    if(no_row > 0){
//                        System.out.println("A user is deleted");
//                    }
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
                String sql = "CREATE PROCEDURE st_delete @username varchar(50) AS DELETE FROM Account WHERE Username = @username";
                String sql2 = "EXEC st_delete ?";
                try {
                    ps = conn.prepareStatement(sql2);
                    ps.setString(1, tfUser.getText());
                    int no_row = ps.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        cont.add(btnList);
        btnList.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {

                                          ConnectDB connectDB = new ConnectDB();
                                          conn = connectDB.connectSQL();
                                          String sql = "SELECT * FROM Account";
//                                          String sql = "CREATE PROCEDURE st_list AS SELECT * FROM Account";
                                          try{
                                              ps = conn.prepareStatement(sql);
                                              ResultSet rs = ps.executeQuery();
                                              if (rs != null){
                                                  while(rs.next()){
                                                      String username = rs.getString("Username");
                                                      String pass = rs.getString("Password");
                                                      String gender = rs.getString("gender");
                                                      tfUser.setText(username);
                                                      tfPass.setText(pass);

                                                  }
                                                  rs.close();
                                              }
                                              ps.close();
                                          } catch (SQLException ex) {
                                              ex.printStackTrace();
                                          }
                                      }
                                  }
        );
        f.setSize(200, 200);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new FacebookForm();
        new FacebookForm();

    }

}
