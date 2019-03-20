import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exempel {
    public static void main(String[] args){
        String filename = "exempel.txt";
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFile = new BufferedReader(fr);

        String line;
        try {
            while ((line = inFile.readLine() ) !=null)
            line = inFile.readLine();
            System.out.println(line);

            inFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
