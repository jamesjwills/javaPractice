// write some code here ....
public class Employee extends Person {

    // Define your data members here
    private String role;
    private double salary;

    //...partial code

    // Define your constructor for this class here
    // Call the constructor of the base class Person from this Employee constructor,
    // and pass it the Name and Age; only initialise Designation and Salary inside 
    // this Employee constructor

    public Employee(String name, int age, String role, double salary) {

        // We first call the constructor of base class Person
        // using the special keyword "super"
        super(name, age);
        this.role = role;
        this.salary = salary;
    }

    // Define your member function here to display all details of an Employee
    // Call this function "display"

    @Override
    public void display() {
        super.display();    // Call the display function of Person 
        System.out.println(" Role : " + this.role);
        System.out.println(" Salary  : " + this.salary);
        
    }
}