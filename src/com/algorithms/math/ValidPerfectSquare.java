package com.algorithms.math;

public class ValidPerfectSquare {
	/*
	 * 1+3+…+(2n-1) = (2n-1 + 1)n/2 = nn
	 */
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
   }

	public boolean _isPerfectSquare(int num) {
		long left = 1, right = num, middle = (left + right) / 2;
		while (left <= right) {
			long sqr = middle * middle;
			System.out.println(left + "~" + middle + "~" + right);
			if (sqr == num) {
				return true;
			} else if (sqr > num) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
			middle = (left + right) / 2;
		}
		return false;
	}
}
