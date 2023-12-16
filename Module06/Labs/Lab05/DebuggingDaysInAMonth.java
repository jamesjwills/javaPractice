import java.util.Scanner;

public class DebuggingDaysInAMonth {

    // This program prints out the number of days in any given month

    // It takes in a String object that holds the name of a month from the console
    // to do this

    // For example, if the month entered is March, when the program runs, we should
    // see
    // The number of days in the month of March is 31
    // ....

    // For this lab, do not worry about leap years ... assume February has 28 days

    // However, this program sometimes gives us the correct output,
    // and at other times the output is wrong

    // Run this program for the months of January, February, April and September
    // What do you notice each time? Which months seem to hve the program running
    // corectly and which don't?

    // Here's a handy reminder in the form of a (kind of!) poem to help you with
    // which months have how many days

    // 30 Days in September,
    // April, June and November
    // All the rest have 31
    // Except February alone
    // which has 28 days each year

    // Your task is to debug the program and have it run correctly for all months

    // Good luck!

    public static void main(String[] args) {

        String month;

        System.out.println(" Hello! This program will tell you how many days there are in any month");
        System.out.println(" Please enter a month, fully spelt out : ");

        try (Scanner input = new Scanner(System.in)) {
            month = input.nextLine();

            switch (month) {

                case "February":
                case "february":
                    System.out.println(" The number of days in the month of " + month + " is 28 ");
                case "January":
                case "january":
                case "March":
                case "march":
                case "May":
                case "may":
                case "July":
                case "july":
                case "August":
                case "august":
                case "September":
                case "september":
                case "October":
                case "october":
                case "December":
                case "december":
                    System.out.println(" The number of days in the month of " + month + " is 31 ");
                    break;
                case "April":
                case "april":
                case "June":
                case "june":
                case "November":
                case "november":
                    System.out.println(" The number of days in the month of " + month + " is 30 ");
                    break;
                default:
                    System.out.println(
                            " Sorry, you have entered a month we don't recognise! Did you spell the month out fully? ");

            }
        }

    }

}
