/**
 * MagicSquareMain.java  11/12/13
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */

public class MagicSquareMain
{
	public static void main(String[] args)
	{
		int[][] sq1 = {{8, 1, 6},
			            {3, 5, 7},
			            {4, 9, 2}};
	  	MagicSquare magic = new MagicSquare(sq1);
	  	System.out.println(magic);
	}
}
