package com.algorithms.array;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int count = m + n - 1;
		while (m > 0 && n > 0) {
			if (nums1[m - 1] >= nums2[n - 1]) {
				nums1[count] = nums1[m - 1];
				m--;
			} else {
				nums1[count] = nums2[n - 1];
				n--;
			}
			count--;
		}
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		}
	}
}
