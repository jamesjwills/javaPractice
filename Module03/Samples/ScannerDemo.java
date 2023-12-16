import java.util.Scanner; // To read strings from the console, we import a special class called Scanner
public class ScannerDemo {
    public static void main(String[] args) {
        String myFirstName;

        // Define an object of type Scanner class,
        // and use the nextLine function to read the string input into the String
        // variable

        Scanner scan = new Scanner(System.in);
        myFirstName = scan.nextLine();

        // Print your name out using the regular println function

        System.out.println(myFirstName);

        // Remember to close the scanner
        scan.close();

    }
}
