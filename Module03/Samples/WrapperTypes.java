import java.util.ArrayList;

public class WrapperTypes {
    public static void main(String[] args) {
int i = 42;
Integer j = new Integer(99);    // Not recommended
j = Integer.valueOf(99); // preferred
j = j + 1;
System.out.println(j);

//ArrayList<int> intArraylist = new ArrayList<int>();
ArrayList<Integer> integerArrayList = new ArrayList<>();
integerArrayList.add(j);
System.out.println(integerArrayList.get(0));
    }
}
