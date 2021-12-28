package Chapter8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame{
    private JButton jButton;
    private JTextField jTextField;
    private JLabel jLabel;

    public void create_frame(){
        jButton = new JButton("Increase");
        jTextField = new JTextField("0");
        jLabel = new JLabel("Label");
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());

        container.add(jButton);
        container.add(jTextField);
        container.add(jLabel);

        pack();

        setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(jTextField.getText());
                temp += 1;
                jTextField.setText(String.valueOf(temp));
            }
        });
    }


    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.create_frame();
    }
}
