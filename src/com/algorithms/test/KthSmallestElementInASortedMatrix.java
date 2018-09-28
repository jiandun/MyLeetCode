package com.algorithms.test;

import com.algorithms.utils.Print;

public class KthSmallestElementInASortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
		int[] heap = new int[k];
		int n = matrix[0].length;
		for (int i = 0; i < k; i++) {
			heap[i] = matrix[i / n][i % n];
		}
		for (int index = k / 2 - 1; index >= 0; index--) {
			down(heap, index);
		}
		Print.printArray(heap);

		for(int i = k ; i < n*n ; i++) {
			if(matrix[i / n][i % n] < heap[0]) {
				heap[0] = matrix[i / n][i % n];
				down(heap, 0);
			}
		}
		return heap[0];
	}
	
	private void down(int[] heap, int i) {
		int k = heap.length;
		while (2 * i + 1 < k) {
			int maxLeaf = 2 * i + 1;
			if (2 * i + 2 < k && heap[maxLeaf] < heap[2 * i + 2])
				maxLeaf = 2 * i + 2;
			if (heap[i] < heap[maxLeaf]) {
				int temp = heap[i];
				heap[i] = heap[maxLeaf];
				heap[maxLeaf] = temp;

				i = maxLeaf;
			}else {
				break;
			}
		}
	}
}
