import java.util.Scanner;

class FullName {
    public static void main(String[] args) {

        // Write some code to enter your first name and last name separately at the
        // console
        // store both into two separate String objects,
        // concatenate them into your full name (assuming First and Last name together
        // form a full name)
        // and display your full name on the screen

        // For example, the output on your screen can look like this
        // My name is : Mary Jones

        // BONUS CHALLENGE : As an added challenge, if you have a middle name too,
        // then accept your first, middle and last names into three String variables
        // and print out your entire full name.
        // But make sure it works with your first and last names, first!!

        System.out.println("Please enter your forename");
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        System.out.println("Please enter you last name");
        String lname = sc.next();
        sc.close();
        System.out.println("My name is " + fname + ' ' + lname);

        // Write your code here...

    }
}