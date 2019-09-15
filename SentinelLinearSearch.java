package algoritmi;

public class SentinelLinearSearch {

	public static void main(String[] args) {
		char [] letters = {'a', 'b', 'c', 'd', 'c'};
		char x = 'i';
		SentinelLinearSearch ex = new SentinelLinearSearch();
		System.out.println(ex.lS(letters, x));
	}

	String lS (char [] A, char x) {
		int n = A.length;
		char last = A[n-1];
		A[n-1] = x;
		int i = 0;
		while (A[i] != x) {
			i++;
		}
		A[n-1] = last;
		if (i < n-1 || A[n-1] == x) {
			return String.valueOf(i);
		}
		else return "NOT-FOUND";
	}
}
