package com.algorithms.array;

/**
 * 左右靠拢，先确定最外围的border；
 * 再一层层递进，较小的border优先计算
 * @author maple
 *
 */
public class TrappingRainWater {
	public int trap(int[] height) {
		if (height == null || height.length <= 2) {
			return 0;
		}

		int left = 0, right = height.length - 1, result = 0;
		while (left < right && height[left] < height[left + 1])
			left++;
		while (left < right && height[right] > height[right - 1])
			right--;
		while (left < right) {
			int leftBorder = height[left], rightBorder = height[right];
			if (leftBorder > rightBorder) {
				while (left < right && leftBorder > height[++left])
					result += leftBorder - height[left];
			} else {
				while (left < right && rightBorder > height[--right])
					result += rightBorder - height[right];
			}
		}
		return result;
	}
}
