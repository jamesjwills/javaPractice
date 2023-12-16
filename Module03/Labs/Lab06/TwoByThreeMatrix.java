import java.util.Scanner;

class TwoByThreeMatrix {
    public static void main(String[] args) {

        // Write a program to create and populate a 2 x 3 Matrix of Integers , and
        // populate it (enter elements into it)
        //
        // Enter the elements from the console when the program is running
        // Use appropriate print statements to prompt the user
        // For Example - Enter Element (1,2) : ...

        // Once you have filled up the array with elements, execute each of the
        // following in order
        //
        // (a) Print out the elements of the matrix in order, so it looks like a matrix
        // (b) The first element of the Matrix ( HINT : It's always the one at position
        // (0 , 0) )
        // (c) All the elements of the Second Row
        // (d) All the elements of the Third Column
        // (e) The Sum of the Elements in EACH Row ( In a 2 x 3 Matrix, there are 2 Rows
        // )
        // (f) The Sum of the Elements in EACH Column ( In a 2 x 3 Matrix, there are 3
        // Columns )
        //

        // (Complete each listed item and make sure your program is running correctly
        // everytime,
        // BEFORE you move onto the next item; this way you build your program
        // incrementally)

        // For example, if you have a 2 x 3 Matrix with the values
        // 1 2 3
        // 4 5 6
        //
        // Then , your output on the screen should be
        // (a) 1 2 3
        // 4 5 6
        // (b) First Element of Matrix : 1
        //
        // (c) Elements of the Second Row : 4 5 6
        // (d) Elements of the Third Column : 3 6
        //
        // (e) Sum of the Elements in Row 1 = 6 , Row 2 = 15
        //
        // (f) The Sum of the Elements in Column 1 = 5, Column 2 = 7, Column 3 = 9
        //
        //
        //
        //

        // Write your code here...

        System.out.println("Enter elements of matrix");
        int[][] matrix = new int[2][3];
        Scanner sc = new Scanner(System.in);
        matrix[0][0] = sc.nextInt();
        matrix[0][1] = sc.nextInt();
        matrix[0][2] = sc.nextInt();
        matrix[1][0] = sc.nextInt();
        matrix[1][1] = sc.nextInt();
        matrix[1][2] = sc.nextInt();

        sc.close();
        for (int i = 0; i < 3; i++) {
            
            System.out.print(String.valueOf(matrix[0][i]) + ' ');
            
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(String.valueOf(matrix[1][i]) + ' ');
        }
        System.out.println();


    }
}