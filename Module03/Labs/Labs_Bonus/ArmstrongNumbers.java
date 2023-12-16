import java.lang.Character;

class ArmstrongNumbers {
    public static void main(String[] args) {

        // Write some code to print all Armstrong Numbers between 1 an 500

        // If sum of cubes of each digit of the number is equal to the number itself,
        // then the number is called an Armstrong number

        // For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        // That is, each of the digits of 153, when cubed , add up to 153 itself
        // Pretty cool!

        // You need to think about how you can capture each digit of a number to start
        // with

        // Since the program will print out all Armstrong Numbers between 1 and 500,
        // you can safely assume that the *maximum* number of digits of any arnstrong
        // number will be three (3); the minimum number of digits is of course just one
        // (1)

        // HINT : You may want to use loops, conditional checks and functions in your
        // code

        // Write your code here ...

        for (int i = 0; i <= 500; i++) {
            String numberAsString = String.valueOf(i);
            int sumOfDigitsCubed = 0;
            for (int j = 0; j < numberAsString.length(); j++) {
                int numericValue = Character.getNumericValue(numberAsString.charAt(j));
                int numericValueCubed = numericValue * numericValue * numericValue;

                sumOfDigitsCubed += numericValueCubed;

            }
            if (sumOfDigitsCubed == i) {
                System.out.println(i);
            }
        }
    }
}
