import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exceptional {

    // #1 - Initially this will not compile because printFile calls
    // library functions that throw checked exceptions.
    // printfile does not meet the catch or specify requirement.
    // Check the documentation for FileReader's constructor,
    // and for BufferedReader's readLine to see what
    // exceptions they throw.
    // Specify them for printFile
    //
    // #2 - The code STILL won't compile because now main does
    // not meet the catch or specify requirement
    // Wrap the calls to printFile in a try/catch block
    // to meet the catch requirement
    // You should separately catch missing files
    // and input/output errors and produce suitable
    // error messages
    // The code should now run and correctly report
    // a missing NoFile.txt

    // #3 - In the event of an exception, printFile does
    // not close the BufferedReader.
    // Adjust the code to use a try/finally to fix this

    // #4 - Improve the code in printFile to use try
    // with resources. It works the same but it's
    // better practice, and automates error prone code
    public static void main(String[] args) {
        printFile("Data.txt");
        printFile("NoFile.txt");
    }

    public static void printFile(String filename) {
        System.out.println("Displaying content of " + filename);
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

}
