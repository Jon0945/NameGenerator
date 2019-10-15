package se.lexicon.files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {}

    private static void scannerReadLastNameFile() {
        Scanner scanfile = null;
        Path filePath = Paths.get("lastnames.txt");
        List<String> lastnameslist = new ArrayList<>();

        try {
            scanfile = new Scanner(filePath); //open file

            while (scanfile.hasNext()) //end of file
            {
                lastnameslist.add(scanfile.nextLine()); //read line in file
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            try {
                scanfile.close(); //never forget to close file
            }
            catch (NullPointerException ee) {
                System.out.println(ee);
            }
        }
        lastnameslist.forEach(System.out::println);
    }
}
