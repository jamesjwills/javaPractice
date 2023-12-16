public class Person{
    // First, we define our data members 
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    // We also define a member function to display the details of a person 
    public void display ()
    {
        System.out.println (" Name : " + this.name);
        System.out.println (" Age  : " + this.age);
        System.out.println(" ");
    }
}