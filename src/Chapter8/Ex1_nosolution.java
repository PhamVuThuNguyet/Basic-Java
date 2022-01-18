package Chapter8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1_nosolution extends JFrame {
    private JButton jButton;
    private JTextField jTextField;
    private JLabel jLabel = new JLabel("EMAIL NOT ACCEPTED!");

    public void create_frame(){
        Container container = this.getContentPane();
        jButton = new JButton("Check Email");
        jTextField = new JTextField("");
        jTextField.setColumns(30);
        jLabel.setForeground(Color.RED);
        jLabel.setVisible(false);
        container.setLayout(new FlowLayout());
        container.add(jButton);
        container.add(jTextField);
        container.add(jLabel);
        pack();
        setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = jTextField.getText();
                String regex = "^(.+)@(\\S+)$";
                if (!email.matches(regex)){
                    jLabel.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        Ex1_nosolution ex1_nosolution = new Ex1_nosolution();
        ex1_nosolution.create_frame();
    }
}
