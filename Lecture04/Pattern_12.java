package Lecture04;

public class Pattern_12 {

	public static void main(String[] args) {
		int n = 5; 
		int row = 1;
		int nsp = n - 1; 
		int nst = 1; 
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++; 
			}
			int cst = 0;
			while (cst < nst) {
				if (cst % 2 != 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
			
				cst++; 
			}
			
			System.out.println();
			row++; 
			nsp--;
			nst = nst + 2; 
		}
	}

}
