
// This program will count the number of instances created
// In the class Item, add a public static int variable named instanceCount
// By being static it is shared by all instances of Item
// In main, print the instanceCount variable before and after creating
// an Item.  (You will find that instanceCount must be public.)
// It should show zero items before creation and one after


// Once you have that working...
// Add a static method to print a message of the 
// form "There are 2 instances"
// Call that function before and after creating the Item again
// it should show zero items before creation and one afterwards.

public class Item{


    public Item(){
        ++instanceCount;
    }




    public static void main(String[] args) {

        // Before creating an item

        Item i = new Item();

        // After creating an item
        
    }
}