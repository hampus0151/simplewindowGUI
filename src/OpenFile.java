import java.util.Scanner;

import javax.swing.JFileChooser;

public class OpenFile<file> {

    //Declare Variable
    JFileChooser fileChooser = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    java.io.File file1;


    public void PickMe() throws Exception {

        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            //get file
            file1 = fileChooser.getSelectedFile();

            //creates a scanner
            Scanner input = new Scanner(file1);

            //reads text from file
            while (input.hasNext()) {
                sb.append(input.nextLine());
                sb.append("\n");

            }

            input.close();
        } else {
            sb.append("No file was selected");
        }
    }
}