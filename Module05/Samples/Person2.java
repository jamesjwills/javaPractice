public class Person2 {
    // ... incomplete code...

    protected String name = "abc";
    protected int age;

    // Constructors
    public Person2() {
        this("");
    }

    public Person2(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return " Name : " + name
            + " Age : " + age;
    }

    // A member function to display a person
    public void display() {
        System.out.println(toString());
    }

    public String getName(){
        return name;
    }
    // ...incomplete code...

    public static void main(String[] args) {
        Person2 p = new Person2();
        p.display();
        Person2 p2 = new Person2("Fred");
        p2.display();
    }
}