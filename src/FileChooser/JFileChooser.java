package FileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JFileChooser {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Rum3006\\Desktop\\newfile.txt");
        if(file.exists()){
            int response = JOptionPane.showConfirmDialog(null, "File is existed!" +
                    "Do you want to replace", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response != JOptionPane.YES_OPTION){
                return;
            }else{
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("Hello World Overwrite");
                fileWriter.close();
                System.out.println("Saved file.");
            }
        }else{
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello World");
            fileWriter.close();
            System.out.println("Saved new file.");
        }
    }
}
