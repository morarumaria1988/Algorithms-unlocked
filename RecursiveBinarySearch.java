package algoritmi;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'c' };
		int n = letters.length;
		int p = 0;
		int r = n - 1;
		char x = 'c';
		RecursiveBinarySearch ex = new RecursiveBinarySearch();
		System.out.println(ex.rBs(letters, p, r, x));
	}
	String rBs (char[] A, int p, int r, char x) {
		if (p > r) return "NOT-FOUND";
		else {
			int q = (p + r)/2;
			if (A[q] == x) return String.valueOf(q);
			else if (A[q] > x) return rBs(A, p, q - 1, x);
			else return rBs(A, q + 1, r, x);
		}
		
	}
}
