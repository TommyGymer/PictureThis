import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] aStrings) {

        String path = "D:\\GitHub Repositories\\PictureThis\\3player.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = "";
            ArrayList<String[]> lines = new ArrayList<String[]>();

            while ((line = br.readLine()) != null) {
                lines.add(line.split(","));
            }

            String[][] data = new String[lines.size()][0];
            lines.toArray(data);

            System.out.println(data[1][2]);

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}