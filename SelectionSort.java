package algoritmi;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		char[] letters = { 'e', 'b', 'c', 'd', 'a' };
		int n = letters.length;
		SelectionSort ex = new SelectionSort();
		ex.sS(letters, n);
		
	}

	void sS(char[] A, int n) {
		for (int i = 0; i < n - 1; i++) {
			int smallest = i;
			for(int j = i + 1; j < n; j++) {
				if (A[j] < A[smallest]) {
					smallest = j;
				}
			}
			char x = A[smallest];
			A[smallest] = A[i] ;
			A[i] =	x;	 
		}
		System.out.println(Arrays.toString(A));
	}
}
