import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    static File file = new File("C://Users//Zver//Desktop//1.txt");
    static ArrayList<String> DaysWorks = new ArrayList<>();

    public void FoundFile(){
        //TODO
    }
    public ArrayList ReadFile(){
        try (java.io.FileReader fr = new java.io.FileReader(file)) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String lastLine;
            int replaysDay = 0;
            while (line != null) {
                lastLine = line;
                line = reader.readLine();
                if (!(lastLine.equals(line)) && replaysDay > 2) {
                    DaysWorks.add(lastLine);
                    replaysDay = 0;
                } else
                    replaysDay++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("This file not correct");
        }
        return DaysWorks;
    }
    public void WriteFile(){
        //TODO
    }
}
