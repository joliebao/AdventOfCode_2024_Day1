import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventSolver {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/InputFile");
        // you now have a list of Strings from the file "InputFile"

    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        ArrayList<String> fileData2 = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = (s.next()).substring(0, 1);
                String line2 = (s.next()).substring(0, 1);
                if (!line.equals("")) {
                    fileData.add(line);
                    fileData2.add(line2);
                }
            }
            System.out.println("LINE1:" + fileData);
            System.out.println("LINE2:" + fileData2);
            AdventDay p = new AdventDay(fileData, fileData2);
            System.out.println(p.compareLists());
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}
