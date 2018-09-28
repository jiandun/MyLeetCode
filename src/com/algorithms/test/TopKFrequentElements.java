package com.algorithms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
		}
		int[] heap = new int[count.size()];
		int index = 0;
		Iterator<Integer> ite = count.keySet().iterator();
		while (ite.hasNext()) {
			heap[index] = ite.next();
			index++;
		}

		for (int i = heap.length / 2; i >= 0; i--) {
			down(count, heap, i, heap.length);
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			int pop = heap[0];
			int newLength = heap.length - i - 1;
			heap[0] = heap[newLength];
			heap[newLength] = pop;
			result.add(pop);

			down(count, heap, 0, newLength);
		}
		return result;
	}

	private void down(HashMap<Integer, Integer> count, int[] heap, int firstIndex, int heapLength) {
		int head = firstIndex;
		while ((head * 2 + 1) < heapLength) {
			int leaf = head * 2 + 1;
			int right = leaf + 1;
			if (right < heapLength && count.get(heap[right]) >= count.get(heap[leaf])) {
				leaf = right;
			}
			if (count.get(heap[leaf]) >= count.get(heap[head])) {
				int temp = heap[leaf];
				heap[leaf] = heap[head];
				heap[head] = temp;
				head = leaf;
			} else {
				break;
			}
		}
	}
}
