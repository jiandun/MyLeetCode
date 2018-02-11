package com.algorithms.backtracking;

public class BeautifulArrangement {
	int count = 0;

	public int countArrangement(int N) {
		if (N == 0)
			return 0;
		helper(N, 1, new int[N + 1]);
		return count;
	}

	/**
	 * 
	 * @param N    阈值，一共有N个数字
	 * @param pos  目前排序到第pos个位置了
	 * @param used 记录第i个数字是否被使用了
	 */
	private void helper(int N, int pos, int[] used) {
		if (pos > N) {
			count++;
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
				used[i] = 1;
				helper(N, pos + 1, used);
				used[i] = 0;
			}
		}
	}
}
