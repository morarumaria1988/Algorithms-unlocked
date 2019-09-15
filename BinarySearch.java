package algoritmi;

public class BinarySearch {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'c' };
		int n = letters.length;
		char x = 'c';
		BinarySearch ex = new BinarySearch();
		System.out.println(ex.lS(letters, n, x));
	}
	String lS(char[] A, int n, char x) {
		int p = 1;
		int r = n - 1;
		while (p <= r) {
			int q = (p + r)/2;
			if (A[q] == x) return String.valueOf(q);
			else if (A[q] > x) r = q - 1;
			else p = q + 1;
		}
		return "NOT-FOUND";
	}
}
