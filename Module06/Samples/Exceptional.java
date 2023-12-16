import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exceptional {
    // Shows three different approaches to exception handling

    // BAD - In the event of an exception the close call is skipped
    public static void printFile(String filename)
            throws FileNotFoundException, IOException {
        System.out.println("Displaying content of " + filename);
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    // Better - uses a finally to ensure the close is called
    // even in the even of an exception
    public static void printFile2(String filename)
            throws FileNotFoundException, IOException {
        System.out.println("Displaying content of " + filename);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (br != null)
                br.close();
        }
    }

    // Uses the modern try with resources approach to
    // automatically call close in the event of an exception
    public static void printFile3(String filename)
            throws FileNotFoundException, IOException {
        System.out.println("Displaying content of " + filename);
        try (BufferedReader br = 
            new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        try {
            printFile3("Data.txt");
            printFile3("NoFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println(
                    "Cannot find file ...."
                            + e.getMessage());
        } catch (IOException e) {
            System.out.println(
                    "Somthing really bad happened "
                            + e.getMessage());
        }
    }
}
