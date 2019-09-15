package algoritmi;

public class LinearSearch {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'c' };
		int n = letters.length;
		char x = 'c';
		LinearSearch ex = new LinearSearch();
		System.out.println(ex.lS(letters, n, x));
	}

	String lS(char[] A, int n, char x) {
		String answer = "NOT-FOUND";
		for (int i = 0; i < n; i++) {
			if (A[i] == x) {
				answer = String.valueOf(i);
				break;// without break it gives the last index where x is found
			}
		}
		return answer;
	}
}
