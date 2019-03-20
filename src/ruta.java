import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.EventQueue;
import javax.swing.JFileChooser;





public class ruta {
    private JLabel titel;
    private JPanel panel;
    private JTextArea textArea1;
    private JButton openButton;
    private JButton helpButton;
    private JButton saveButton;

    public ruta() {
        OpenFile of = new OpenFile();
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"press open to open file or save to save file");
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter(of.file1.getAbsoluteFile(), true);
                    textArea1.write(fw);
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //runs Pickme
                try {
                    of.PickMe();
                }
                catch (Exception e1){
                    e1.printStackTrace();
                }
                //makes the text file read abel in the textarea
                textArea1.setText(of.sb.toString());
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Notepad");
        frame.setContentPane(new ruta().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);

    }
}
