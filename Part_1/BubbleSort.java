package Part_1;
/*
 * A class that separates the code for the Bubble Sort algorithm from the 
 * main program. Performance of the Bubble Sort algorithm is O(n^2), 
 * which means the sort time increases by a power of two as the length of 
 * the array increases.
 */

public class BubbleSort {

    /**
     * The actual method for doing the sorting
     * @param arr a two-dimensional array to be sorted. For this assignment, the array is sorted by the Capital
     */
    public void sort(String[][] arr) {

        // First for-loop traverses through the rows
        for (int row = 0; row < arr.length; row++) {

            // Second for-loops traverses the columns of each row
            for (int column = 0; column < arr.length - row - 1; column++) {

                // Compare
                if (arr[column][1].compareTo(arr[column + 1][1]) > 0) {

                    // Temp variable to hold the values in the first and second column of the current row
                    String temp1 = arr[column][0];
                    String temp2 = arr[column][1];

                    // Swap four lines performs the swap to put them in oreder
                    arr[column][0] = arr[column + 1][0];
                    arr[column][1] = arr[column + 1][1];

                    arr[column + 1][0] = temp1;
                    arr[column + 1][1] = temp2;
                }
            }
        }

    }

    /**
     * A non-essential method to print the array after being sorted
     * @param arr the two-dimensional array to be printed
     */
    public void print(String[][] arr) {

        for (int row = 0; row < arr.length; row++) {
            System.out.println("Capital: " + arr[row][1]  + ", State: " + arr[row][0]);
        }
        
    }
}
