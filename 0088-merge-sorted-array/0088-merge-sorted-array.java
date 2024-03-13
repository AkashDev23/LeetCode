class Solution {
public void merge(int[] A, int m, int[] B, int n) {
	for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {// i will have the total length of the array, initialize variable a and b with length of the respective array, and decrement this loop.
		if (a >= 0 && A[a] > B[b]) {// if a >= 0 and its element is biger than the element of b.
            A[i] = A[a--]; // Swap with the previous element of a 
        }
		else A[i] = B[b--];// Otherwise it will swap with previous element of b
	}        
 }
}