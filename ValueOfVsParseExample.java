public class ValueOfVsParseExample {
    public static void main(String[] args) {
        // Using valueOf for autoboxing
        String strValue1 = "123";
        Integer intValue1 = Integer.valueOf(strValue1); // Returns an Integer object

        // Using parseXxx for obtaining primitive value
        String strValue2 = "456";
        int intValue2 = Integer.parseInt(strValue2); // Returns an int

        // Printing results
        System.out.println("Using valueOf: " + intValue1); // Autoboxing
        System.out.println("Using parseXxx: " + intValue2); // Parsing
    }
}
