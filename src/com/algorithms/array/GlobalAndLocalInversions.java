package com.algorithms.array;

public class GlobalAndLocalInversions {
	public boolean isIdealPermutation(int[] A) {
		if (A.length <= 2)
			return true;
		for (int i = 0, maxn = -1; i < A.length - 2; i++) {
			maxn = Math.max(maxn, A[i]);
			if (maxn > A[i + 2])
				return false;
		}
		return true;
	}

	public boolean _isIdealPermutation(int[] A) {
		if (A == null || A.length <= 0)
			return true;

		int local = 0, global = 0;
		for (int i = 0; i < A.length; i++) {
			if (i + 1 < A.length && A[i] > A[i + 1]) {
				local++;
			}
		}
		for (int i = A.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (A[j] > A[i]) {
					global++;
				}
			}
		}
		return local == global;
	}
}
