mport java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        // 3.1 Simple Implementation
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Simple Array: " + Arrays.toString(myArray));

        // 3.2 Display via For Loop
        System.out.println("Displaying Array Elements:");
        for (int element : myArray) {
            System.out.println(element);
        }

        // 3.3 Multidimensional Array
        int[][] multidimensionalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Multidimensional Array:");
        for (int[] row : multidimensionalArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}