import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {

        // Define an ArrayList object that only works with Strings
        // (You will need an import for java.util.ArrayList)
        // Print its size

        // Add a name
        // Print the new size
        
        // Add another name

        // Print the names in the ArrayList, try both a counted loop and the for each loop

        // Remove the first item
        // Print the new first item

        // Write your code here...
        ArrayList<String> myStringArrayList = new ArrayList<>();
        System.out.println(myStringArrayList.size());
        myStringArrayList.add("James");
        System.out.println(myStringArrayList.size());
        myStringArrayList.add("Muffin");
        myStringArrayList.add("Rebecca");
        for (String item : myStringArrayList) {
            System.out.println(item);
        }
        myStringArrayList.remove(0);
        System.out.println(myStringArrayList.get(0));
        
    }
}
