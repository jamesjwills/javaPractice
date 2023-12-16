public class Person {
    protected String name;
    protected int age;

    // Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // A member function to display a person
    public void display() {
        System.out.println(" Name : " + this.name);
        System.out.println(" Age  : " + this.age);
        System.out.println(" ");
    }

    public String getName() {
        return name;
    }

}