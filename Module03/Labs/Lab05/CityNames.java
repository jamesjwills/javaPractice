import java.util.Scanner;

class CityNames {
    public static void main(String[] args) {

        // Write some code to create an array of 3 String objects
        // From the console, enter the names of any 3 cities you like into each element
        // of the String array
        // and print the array out in order

        // For example, the output on your screen might look like this
        // Cities of the World : London Bangalore Madrid

        System.out.println("Please enter your cities");
        String[] cities = new String[3];
        Scanner sc = new Scanner(System.in);
        cities[0] = sc.next();
        cities[1] = sc.next();
        cities[2] = sc.next();
        for (String city : cities) {
            System.out.println(city);
        }


        sc.close();

        // Write your code here...

    }
}