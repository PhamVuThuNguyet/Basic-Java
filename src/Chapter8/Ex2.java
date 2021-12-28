package Chapter8;

import javax.swing.*;
import java.awt.*;

public class Ex2 extends JFrame {
    private JLabel jLabel;
    private Checkbox checkbox1, checkbox2, checkbox3, checkbox4;

    public void create_frame(){
        jLabel = new JLabel("Question?");
        checkbox1 = new Checkbox("Answer A", false);
        checkbox2 = new Checkbox("Answer B", false);
        checkbox3 = new Checkbox("Answer C", false);
        checkbox4 = new Checkbox("Answer D", false);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 1));
        container.add(jLabel);
        container.add(checkbox1);
        container.add(checkbox2);
        container.add(checkbox3);
        container.add(checkbox4);

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
