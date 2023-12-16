class SimpleSwap {

    public static void main(String args[]) {
        // Write some code to swap the values of two integers

        // For example, if num1 = 4 and num2 = 10
        // then after your program runs, the values should be swapped
        // IE, the values of the variables should be : num1 = 10 and num2 = 4

        // Try and think about how you can do this - do you need another variable?

        // Write some code here .... the two integers are already defined for you

        int number1 = 10;
        int number2 = 20;
        int box = 1;
        box = number1;
        number1 = number2;
        number2 = box;
        System.out.println(number1);
        System.out.println(number2);

    }
}