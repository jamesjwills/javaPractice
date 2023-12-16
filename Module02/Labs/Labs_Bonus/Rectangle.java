class Rectangle {
    public static void main(String[] args) {
        // Write a Program to check if the Area of a Rectangle is greater than its
        // Perimeter

        // The Area of a Rectangle is its length multiplied by its breadth; 
        // while its Perimeter is the sum of its length and breadth, multiplied by 2


        // For example : 
        // If length is 4, and breadth is 5, the Area is 4 x 5 = 20
        // and Perimeter  = 2 x ( 4 + 5) = 2 x 9 = 18

        // For this lab, you may assign the values of length and breadth in your code

        // Change the values of length and breadth a few times, just to make sure your program
        // works for all comparisons correctly

        // Write your code here ...

        int length = 8; // Assign length here
        int breadth = 8; // Assign breadth here

        if (length*breadth > (length+breadth)*2) {
            System.out.println("Area is bigger than perimeter");
        } else if (length*breadth < (length+breadth)*2) {
            System.out.println("Perimeter is bigger than the area");
        } else {
            System.out.println("Perimeter and area have the same value");
        }
    

    }
}