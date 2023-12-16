import java.util.*;
import java.util.ArrayList;
public class MethodDemo {
    
    public static void main(String[] args) {
        printHello();
        printHelloWithName("John");
        
        String fullname =  printHelloWithName("Jane", "Doe");
        

        System.out.println(fullname);


        
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printHelloWithName(String name){
        System.out.println("Hello " + name);
    }
    public static String printHelloWithName(String fname, String lname){
        String fullHello = String.format("Hello %-10s%s",fname,lname);

        return fullHello; // return type must match
    }

    public static double divide(double n, double m){
        double result = n / m;
        return result;
    }
    public static void sortValue(String[] ar){
        ArrayList<Double> values = new ArrayList<>();
        for (String str : ar) {
            double num2 = Double.parseDouble(str);
            values.add(num2);
        }
        Collections.sort(values);
        for (Double double1 : values) {
            System.out.print(double1 + " ");
        }
    }
}