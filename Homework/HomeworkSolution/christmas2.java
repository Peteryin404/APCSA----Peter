package javaPractice;

public class christmas2 {
	
	private int rows;
	public christmas2(int rows) {
		
		this.rows = rows;
		
	}
	
	// print tree with odd numbers of stars
	public void tree() {
		//convert the number to odd number
		if (rows%2 ==0) {
			rows -= 1;
			
		}
		for (int i=rows; i>=1; i-=2) {

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
		System.out.println(" ");
	}
}
