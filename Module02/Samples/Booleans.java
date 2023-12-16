import javax.swing.SortingFocusTraversalPolicy;

public class Booleans {
    public static void main(String[] args) {
        boolean b = true;
        b = false;

        int age = 21;

        if (age >= 0 && age < 18)
            System.out.println("Child");

        if (age >= 18 && age < 65)
            System.out.println("Adult");

        if (age < 18 || age >= 65)
            System.out.println("Not an adult");

        if (!(age >= 18 && age < 65))
            System.out.println("Not an adult");

        if (i < 1) {
            System.out.println("The value is outside the range");
        } else if (i <= 100) {
            System.out.println("The value is inside the range");
        } else {
            System.out.println("The value is outside the range");
        }
    }

}
