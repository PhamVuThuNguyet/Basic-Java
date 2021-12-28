package Chapter8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex3 extends JFrame {
    private JComboBox jComboBox;

    public void create_frame(){
        jComboBox = new JComboBox();
        jComboBox.addItem("Red");
        jComboBox.addItem("Green");
        jComboBox.addItem("Blue");
        jComboBox.addItem("Black");
        jComboBox.addItem("White");

        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jComboBox);

        setVisible(true);

        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = jComboBox.getSelectedIndex();
                switch (index){
                    case 0:
                        container.setBackground(Color.RED);
                        break;
                    case 1:
                        container.setBackground(Color.GREEN);
                        break;
                    case 2:
                        container.setBackground(Color.BLUE);
                        break;
                    case 3:
                        container.setBackground(Color.BLACK);
                        break;
                    case 4:
                        container.setBackground(Color.WHITE);
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        ex3.create_frame();
        ex3.setSize(700, 700);
    }
}
