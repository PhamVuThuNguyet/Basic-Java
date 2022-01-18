package Chapter8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class SimpleCalculator extends JFrame {
    private JTextField x, y, result;
    private JButton add, minus, mul, div, number1;
    private JLabel x_label, y_label, result_label;

    public SimpleCalculator() {
        Container container = this.getContentPane();

        x_label = new JLabel("x");
        y_label = new JLabel("y");
        result_label = new JLabel("=");
        x = new JTextField();
        y = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3, 2));
        jPanel.add(x_label);
        jPanel.add(x);
        jPanel.add(y_label);
        jPanel.add(y);
        jPanel.add(result_label);
        jPanel.add(result);

        add = new JButton("+");
        minus = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        number1 = new JButton("1");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));
        panel.add(add);
        panel.add(minus);
        panel.add(mul);
        panel.add(div);
        panel.add(number1);

        container.add(jPanel);
        container.add(panel, "South");

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x_, y_;
                x_ = Double.parseDouble(x.getText());
                y_ = Double.parseDouble(y.getText());
                double result_ = x_ + y_;
                result.setText(String.valueOf(result_));
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x_, y_;
                x_ = Double.parseDouble(x.getText());
                y_ = Double.parseDouble(y.getText());
                double result_ = x_ - y_;
                result.setText(String.valueOf(result_));
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x_, y_;
                x_ = Double.parseDouble(x.getText());
                y_ = Double.parseDouble(y.getText());
                double result_ = x_ * y_;
                result.setText(String.valueOf(result_));
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x_, y_;
                x_ = Double.parseDouble(x.getText());
                y_ = Double.parseDouble(y.getText());
                double result_ = x_ / y_;
                result.setText(String.valueOf(result_));
            }
        });
        number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x.setText("1");
                y.setText("1");
            }
        });

        number1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
    }
}
