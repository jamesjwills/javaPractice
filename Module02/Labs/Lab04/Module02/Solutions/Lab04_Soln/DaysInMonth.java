public class DaysInMonth {
    public static void main(String[] args) {
        // Part 1
        // Create a switch statement to determine the number of days in a given month.
        // For February, only consider the simple case of a year divisible by 4
        // Assume that January is month 1.

        int month = 2;
        int year = 2022;

        int numDays = 0;

        // Write your code here. Put the number of days in the month into numDays

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (year % 4 == 0)
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Not a valid month");
                break;
        }
        System.out.println(numDays);
    }

}
