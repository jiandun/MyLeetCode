package com.algorithms.array;

import java.util.Arrays;

/**
 * 没考虑到的点： 
 * 1.两个出现次数相同的task是可以绑定在一起的 
 * 2.最终的数组总是可以分成MaxCount-1个块，每块有n+1个元素
 * @author maple
 *
 */
public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		int[] c = new int[26];
		for (char t : tasks) {
			c[t - 'A'] += 1;
		}
		Arrays.sort(c);
		int i = 25;
		while (i >= 0 && c[i] == c[25])
			i--;
		//最后的(25-i)指的是出现次数最多的task的个数
		return Math.max(tasks.length, (c[25] - 1) * (n + 1) + (25 - i));
	}
}
