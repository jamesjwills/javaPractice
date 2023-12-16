public class Arrays {
    public static void main(String[] args) {
        int[] intArray;

        intArray = new int[10];

        int[] intArray2 = new int[] { 2, 10, 3 };

        intArray[0] = 10;
        intArray[5] = 99;
        System.out.println(intArray[5]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
