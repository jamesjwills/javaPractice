// This code correctly tells you if a year is a leap year or not
// Test cases for number of days in Feb: passes?
// 2020: 29 y
// 1900: 28 y
// 2000: 29 y
// 2100: 28 y
// 2400: 29 y

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays = 0;

        while (true) {

            System.out.println("Enter a year");

            // Below we have two options for the scanner

            // int year = Integer.parseInt(scanner.nextLine());
            // OR

            int year = scanner.nextInt();
            scanner.nextLine(); // consumes new line character

            System.out.println("Enter a month number");

            // Similarly below
            // int month = Integer.parseInt(scanner.nextLine());
            int month = scanner.nextInt();
            scanner.nextLine(); // consumes new line character

            /*
             * It seems to be really important that lines 26 and 33 are there if I use
             * nextInt on the previous
             * lines 25 and 32. I read about it and apparently it's about "consuming" new
             * new line or something
             * But I don't really have deep understanding of this
             * If I comment out lines 26 and 33, the code terminates after it prints
             * "Would you like to continue"
             * on line 81
             * On the other hand if I use the code on lines 22 and 31 by using nextLine and
             * parsing the
             * string to an integer, everything works perfectly
             * So why to I need lines 26 and 33 if I use nextInt on lines 25 and 32?
             */

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
                    // if year is divisible by 4, 100 and 400, 29. If divisible by 4, but not 100,
                    // 29.
                    // if year not divisible by 4, 28. If divisible by 4 and 100 but not 400, 28.
                    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                        numDays = 29;
                        System.out.println(
                                "The number of days in month " + month + " in year " + year + " is " + numDays);

                    } else {
                        numDays = 28;
                        System.out.println(
                                "The number of days in month " + month + " in year " + year + " is " + numDays);
                    }
                    ;
                    break;
                default:
                    System.out.println("Invalid month");

            }
            System.out.println("Would you like to continue? Type yes to continue or type no to exit.");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                continue;
            } else if (answer.equals("no")) {
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