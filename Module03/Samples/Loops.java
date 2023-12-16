public class Loops {
    public static void main(String[] args) {
        // This loop displays the values 0 through 9.
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i = i + 1;
        }

        // This loop displays the values 0 through 9.
        for (int j = 0; j < 10; j = j + 1) {
            System.out.println(i);
        }

        int j = 0;
        // Different ways of adding 1
        j = j + 1;
        j += 1;
        j++;
        ++j;

        // This loop displays the values 0 through 9.
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        // Displays 0 through 9...
        // Displays 2000 if k is initialized to 2000
        int k = 0;
        do {
            System.out.println(k);
            k = k + 1;
        } while (k < 10);

        {
            int l = 0;
            {
                l = 99; // Visible here
            }
        }
        // Not visible here

        for (int m = 0; m < 10; m++) {
            int n = 0;  // Visible in for loop
                        // and nested blocks
            // m Visible here
        }
        // m not visible here
    }

    public static void f() {
        int i;
        int j;

        i = 0;
        j = ++i; // i == 1 and j == 1

        i = 0;
        j = i++; // i == 1 and j == 0

        i = 0;
        j = 0;
        int k = ++i + j++; // i and j == 1, k = 1
    }

}
