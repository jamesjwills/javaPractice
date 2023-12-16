// write some code here ....
public class Employee2 extends Person2 {

    // Define your data members here
    private String role;
    private double salary;

    //...incomplete code...

    // Define your constructor for this class here
    // Call the constructor of the base class Person from this Employee constructor,
    // and pass it the Name and Age; only initialise Designation and Salary inside 
    // this Employee constructor

    public Employee2(String name, int age, String role, double salary) {

        // We first call the constructor of base class Person
        // using the special keyword "super"
        super(name, age);
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()
         + " Role : " + role
         + " Salary : " + salary;
    }
    // No longer needs to override display!!!

    public static void main(String[] args) {
            Employee e = ...;
            e.display();
    }
}