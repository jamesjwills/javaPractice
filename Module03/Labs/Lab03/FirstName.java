import java.util.Scanner;

class FirstName {
    public static void main(String[] args) {
        // Write some code to enter your first name at the console (once the program is running), 
        // store it into a String object, 
        // and display it on the screen once you have finished entering it


        // For example, the output on your screen can look like this 
        // My name is : Janet 
        // Of course, feel free to substitute your own name here! Unless you really are called Janet ...


        System.out.println("Please enter your first name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("My name is " + name);
        sc.close();

        // Write your code here...

    }
}