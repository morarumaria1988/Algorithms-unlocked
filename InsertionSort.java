package algoritmi;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		char[] letters = { 'e', 'b', 'c', 'd', 'a' };
		int n = letters.length;
		InsertionSort ex = new InsertionSort();
		ex.iS(letters, n);

	}

	void iS(char[] A, int n) {
		for (int i = 1; i < n; i++) {
			char key = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = key;
		}
		System.out.println(Arrays.toString(A));
	}
}
