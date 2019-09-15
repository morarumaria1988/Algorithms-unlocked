package algoritmi;

public class BetterLinearSearch {

	public static void main(String[] args) {
		char [] letters = {'a', 'b', 'c', 'd', 'c'};
		int n = letters.length;
		char x = 'c';
		BetterLinearSearch ex = new BetterLinearSearch();
		System.out.println(ex.lS(letters, n, x));
	}

	String lS (char [] A, int n, char x) {
		for (int i = 0; i < n; i++) {
			if(A[i]== x) {
				return String.valueOf(i);
			}
		}	
		return "NOT-FOUND";
	}
}
