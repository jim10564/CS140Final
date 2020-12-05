import java.util.ArrayList;

/**
 * Provides a method to determine if an array is a Magic Square.
 * 
 * @author Karl R. Wurst
 * @version Project 5
 */
public class MagicSquare
{
    /** 
     * Determines if an array is a Magic Square.
     * 
     * @param square a two-dimensional array of ints
     * @return true if the array is a Magic Square
     */
    public static boolean isMagicSquare(int[][] square) {
        /* If the array is not square and 
         * does not contain all numbers from 1 to n*n,
         * where n is the length of the sides,
         * it's not a Magic Square
         */
        if (!isSquare(square) || !containsAllNumbers(square)) {
            return false;
        }

        /* Get the sum of the first diagonal, and remember it
         * If the other diagonal's sum doesn't match, it's not a Magic Square
         */
        int sum = diagonal1Sum(square);
        if (sum != diagonal2Sum(square)) {
            return false;
        }

        // If the sums of each of the rows does not match, it's not a Magic Square
        if (sum != rowSums(square)) {
            return false;
        }

        // If the sums of each of the columns does not match, it's not a Magic Square
        if (sum != colSums(square)) {
            return false;
        }

        // Passed all tests - it is a Magic Square
        return true;
    }

    /**
     * Determines if an array is a square.
     * 
     * @param square a two-dimensional array of ints
     * @return true if the array is a square (all rows and cols are same length, and not zero length)
     */
    public static boolean isSquare(int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }

        boolean square = true;
        for (int col = 0; col < rows; col++) {
            if (array[col].length != rows) {
                square = false;
            }
        }
        return square;
    }

    /**
     * Determines if the array contain all numbers from 1 to n*n,
     * where n is the length of the sides
     * 
     * @param square a square, two-dimensional array of ints
     * @return true if the array contain all numbers from 1 to n*n
     */
    public static boolean containsAllNumbers(int[][] square) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numList.add(square[row][col]);
            }
        }

        boolean all = true;
        for (int num = 1; num <= square.length * square.length; num++) {
            if (numList.indexOf(num) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Get the sum of the first diagonal
     * (upper-left to lower-right)
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the diagonal
     */
    public static int diagonal1Sum(int[][] square) {
        int sum= 0;
        int i=0;
        for(i = 0; i < square.length; i++){
            sum +=square[i][i];
        }

        return sum; // to keep the compiler happy - remove this
    }

    /**
     * Get the sum of the second diagonal
     * (upper-right to lower-left)
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the diagonal
     */
    public static int diagonal2Sum(int[][] square) {
        int sum= 0;
        int row=0;
        int col=0;
        for(row= 0; row< square.length; row++){
            col = (-1*row) + 3;
            sum +=square[row][col];
        }
        return sum;
    }

    /**
     * Get the sum of each row, if they are all the same 
     * @param square a square, two-dimensional array of ints
     * @return -1 if the sums don't match, sum of the first row otherwise
     */
    public static int rowSums(int[][] square) {
        int i;
        int previousValue=rowSum(square,0);
        int rowSums=0;
        for (i = 0; i < square.length; i++){

            if (rowSum(square,i) ==  previousValue){
                rowSums = rowSum(square,i);
                previousValue = rowSum(square,i);
            }
            else{
                return -1;
            }
        }
        return rowSums;
    }

    /**
     * Get the sum of each col, if they are all the same
     * 
     * @param square a square, two-dimensional array of ints
     * @return -1 if the sums don't match, sum of the first ol otherwise
     */
    public static int colSums(int[][] square) {
        int i;
        int previousValue= colSum(square,0);
        int colSums=0;
        for (i = 0; i < square.length; i++){

            if (colSum(square,i) ==  previousValue){
                colSums = colSum(square,i);
                previousValue = colSum(square,i);
            }
            else{
                return -1;
            }        
        }
        return colSums;
    }

    /**
     * Get the sum of a given row
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the given row
     */
    public static int rowSum(int[][] square, int row) {
        int sumRow= 0;
        int j;

        for(j = 0; j< square[row].length; j++){

            sumRow +=square[row][j];
        }
        return sumRow; 
    }

    /**
     * Get the sum of a given column
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the given column
     */
    public static int colSum(int[][] square, int col) {
        int i;
        int j;
        int sumCol=0;
        for(i= 0; i < square.length; i++){
            for(j= 0; j < square[i].length; j++){
                if (j== col){
                    sumCol+=square[i][j];
                }
            }
        }
        return sumCol; 
    }
}
