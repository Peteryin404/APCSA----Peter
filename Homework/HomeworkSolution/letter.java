package javaPractice;

public class letter {
	
	private int rows;
	public letter(int rows) {
		
		this.rows = rows;
		
	}
	
	// print K with stars
	// the k has fixed length
	public void k() {
		for (int i=1; i<=rows; i+=1) {

			//print *
			System.out.print("  *");
			if (i<=rows/2) {

			for (int j=1; j<=rows/2 - i; j++)
			{
			System.out.print(" ");

			}
			System.out.print("*");
			
			}
			
			else
			{
			//print *
			for (int k= 1; k<= i- rows/2; k++) {
			System.out.print(" ");
			
			}
			System.out.print("*");
			
			}
			System.out.println(" ");
		}
		
	}
}
