package algoritmi;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'c', 'e' };
		int n = letters.length;
		int i = 0;
		char x = 'c';
		RecursiveLinearSearch ex = new RecursiveLinearSearch();
		System.out.println(ex.rLs(letters, n, i, x));
	}
	
	String rLs (char[] A, int n, int i, char x) {
		if (i > n - 1) return "NOT-FOUND";
		else if (A[i] == x) return String.valueOf(i);
		else return rLs (A, n, i + 1, x);
	}
}

