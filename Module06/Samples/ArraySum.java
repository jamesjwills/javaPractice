public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("The sum is " + Sum(arr));

    }

    private static int Sum(int[] array){
        int total = 0;
        for (int i = 1; i < array.length; i++) {
            System.out.println("Subscript " + i 
                + " value " + array[i]);
            total += array[i];
        }
        return total;
    }
}
