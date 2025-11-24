package javaPractice;

public class christmas3 {
	
	private int rows;
	public christmas3(int rows) {
		
		this.rows = rows;
		
	}
	
	// print tree with odd numbers of stars
	public void tree() {
		for (int i=1; i<=rows; i+=2) {

			//print space

			for (int j=1; j<=(rows-i)/2; j++)
			{
			System.out.print(" ");

			}
			//print *
			for (int k= 1; k<= i; k++) {
			System.out.print("*");
			
			}
			System.out.println(" ");

		}
		
	}
}
