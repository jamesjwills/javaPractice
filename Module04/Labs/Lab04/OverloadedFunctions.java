class OverloadedFunctions {

    public static void main(String[] args) {

        // Write three separate functions with the same name, that add different types of things
        // In other words, write overloads of the same function, to add :
            // (a) Two Integers
            // (b) Two Doubles
            // (c) Two Strings 

        // Take care that the result of the addition in each function is stored in the correct type of variable
        
        // For example, if you add two integers, the sum must be stored in an integer
        // Have a think about : What does it mean to add two strings?

        // Return the result of each of these functions to main() and display it 
        


        // Write the code to call your overloaded functions here ....
        System.out.println(addNums(3.14,3.2));
        System.out.println(addNums(5,3));
        System.out.println(addNums("James ", "Wills"));

    }
static double addNums(double num1, double num2) {
    return num1 + num2;
}

static int addNums(int num1, int num2) {
    return num1 + num2;
}

static String addNums(String num1, String num2) {
    return num1 + num2;
}
    // Will you write each of your functions here? If so, why?

}

// Or, Will you write each of your functions here? If so, why?
