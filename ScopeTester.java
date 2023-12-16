public class ScopeTester {
    int number = 20;//instance variable declared

    public void test() {
        int number = 5;//local variable declared with the same name as instance variable.
        System.out.println(this.number);
        doubleTheNumber(number);//doubles the value of the local variable (here, 'number' refers to the local variable) and assigns is to the instance variable.
        System.out.println(this.number);//prints 10. 20 has been substituted for 10.
        System.out.println(number);// prints 5. local variable has not been changed.
    }

    void doubleTheNumber(int number) {
        this.number = number*2;
    }

    public static void main(String[] args) {
        ScopeTester st = new ScopeTester();
        st.test();
    }
}
