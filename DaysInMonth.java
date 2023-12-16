// This code correctly tells you if a year is a leap year or not
// Test cases for number of days in Feb: passes?
// 2020: 29 y
// 1900: 28 y
// 2000: 29 y
// 2100: 28 y
// 2400: 29 y

import java.util.Scanner;

public class DaysInMonth {
    static int numDays = 0;
    static int month = 0;
    static void isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            numDays = 29;
            System.out.println(
                    "The number of days in month " + month + " in year " + year + " is " + numDays);

        } else {
            numDays = 28;
            System.out.println(
                    "The number of days in month " + month + " in year " + year + " is " + numDays);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a year");
            int year = scanner.nextInt();
            System.out.println("Enter a month number");
            int month = scanner.nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    System.out.println("The number of days in month " + month + " in year " + year + " is " + numDays);
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    System.out.println("The number of days in month " + month + " in year " + year + " is " + numDays);
                    break;
                case 2:
                    isLeapYear(year);
                    break;
                default:
                    System.out.println("Invalid month");

            }
            scanner.nextLine();
            System.out.println("Would you like to continue? yes/no:");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                continue;
            } else {
                break;
            }
        }
        ;
        scanner.close();

    }

}

// Below is alternative but more cumbersome logic for calculating the leap year
/*
 * if (year % 4 == 0) {
 * if (year % 100 == 0) {
 * if (year % 400 == 0) {
 * numDays = 29;
 * } else {
 * numDays = 28;
 * }
 * } else {
 * numDays = 29;
 * }
 * } else {
 * numDays = 28;
 * System.out.println("The number of days in month " + month + " in year " +
 * year + " is " + numDays);
 * }
 * 
 */