/**
 * MagicSquare.java  11/12/13
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */

public class MagicSquare
{
    private int[][] data;
    private int rowSum; 	//initialize to one of the row sums of data

    //-----------------------------------------------------------------
    // precondition: d is a square matrix with at least one row.
    // Initializes data to a NEW COPY OF d, and the row sum
    //-----------------------------------------------------------------
    public MagicSquare(int[][] d)
    {

    }
    //-----------------------------------------------------------------
    // returns true if each number in data is unique
    // and in the range of 1 to data.length * data[0].length
    // THIS METHOD IS EXTRA CREDIT.  DO IT LAST!
    //-----------------------------------------------------------------
    public boolean isUnique()
    {
        return true; //replace this
    }

    //-----------------------------------------------------------------
    // returns true if data is a magic square.  A rectangular 2D array
    // is magic iff every row, column, and diagonal sums to the same
    // number and each number is unique and in the range from
    // 1 to data.length * data[0].length
    //-----------------------------------------------------------------
    public boolean isMagic()
    {
        return true; //replace this
    }

    //-----------------------------------------------------------------
    // returns true iff each individual row sum is equal to rowSum
    //-----------------------------------------------------------------
    public boolean rowSumsEqual()
    {
        return true; //replace this
    }

    private int rowSum(int[] row)
    {
        return 0; //replace this
    }

    //-----------------------------------------------------------------
    // returns true iff each individual column sum is equal to rowSum
    //-----------------------------------------------------------------
    public boolean columnSumsEqual()
    {
        return true; //replace this
    }

    private int colSum(int colNum)
    {
        return 0; //replace this
    }

    //-----------------------------------------------------------------
    // returns true iff each individual diagonal sum is equal to rowSum
    //-----------------------------------------------------------------
    public boolean diagonalSumsEqual()
    {
        return true; //replace this
    }

    //-----------------------------------------------------------------
    // returns a String that contains the values in data and a message
    // stating whether or not magic is a magic square.
    // The string format must EXACTLY match the following examples.
    // There must be a single space character after each number.
    // Note: "//"s should not be in your string.
    //
    // Example 1:
    //
    //    8 1 6
    //    3 5 7
    //    4 9 2
    //    MAGIC SQUARE
    //
    // Example 2 (if you have finished the isUnique EXTRA CREDIT)
    //
    //    2 2 2
    //    2 2 2
    //    2 2 2
    //    NOT A MAGIC SQUARE
    //
    // Example 3 (if you have not finished the isUnique EXTRA CREDIT)
    //
    //    2 2 2
    //    2 2 2
    //    2 2 2
    //    MAGIC SQUARE
    //-----------------------------------------------------------------
    public String toString()
    {
        return "";
    }
}
