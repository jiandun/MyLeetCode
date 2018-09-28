package com.algorithms.test;

public class PeakIndexInAMountainArray {
	public int peakIndexInMountainArray(int[] A) {
//		for(int i = 0 ; i < A.length - 1 ; i++) {
//			if(A[i] > A[i+1])
//				return i;
//		}
//		return -1;
		int left = 0, right = A.length - 1;
		int middle = (left+right) /2;
		while(middle > left && middle < right) {
			if(A[middle] > A[middle+1] && A[middle] > A[middle - 1])
				return middle;
			else if(A[middle] > A[middle+1])
				right = middle;
			else
				left = middle;
			middle = (left+right) /2;
		}
		return -1;
	}
}
