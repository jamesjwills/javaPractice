public class Person {
    protected String name = "abc";
    protected int age;

    // Constructors
    public Person() {
        self("");
    }

    public Person(String name) {
        this.name = name;
    }

    // A member function to display a person
    public void display() {
        System.out.println(" Name : "
                + this.name);
        System.out.println(" Age  : "
                + this.age);
        System.out.println(" ");
    }

    public String getName(){
        return name;
    }
    // ...incomplete code...

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}