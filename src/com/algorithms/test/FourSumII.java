package com.algorithms.test;

import java.util.HashMap;

public class FourSumII {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();
		int result = 0;
		for(int i = 0 ; i < A.length ; i++) {
			for(int j = 0 ; j < B.length ; j++) {
				int target = 0-(A[i]+B[j]);
				dp.put(target, dp.getOrDefault(target, 0)+1);
			}
		}
		
		for(int i = 0 ; i < C.length ; i++) {
			for(int j = 0 ; j < D.length ; j++) {
				int another = C[i]+D[j];
				if(dp.getOrDefault(another, 0) > 0) {
					result += dp.get(another);
				}
			}
		}
		return result;
	}
}
