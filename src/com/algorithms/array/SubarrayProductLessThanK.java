package com.algorithms.array;

public class SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int left = 0, right = 0, result = 0;
		//貌似用long保险一点？
		long window = 1; 
		while (left < nums.length && right < nums.length) {
			long temp = window * nums[right];
			if (temp < k) {
				if (nums[right] < k)
					result++;
				window = temp;
				result += right - left;
				right++;
			} else if(left < right){
				window /= nums[left];
				left++;
			}else{//最后这个else保证：当出现nums[i] > k的时候，需要直接跳过这个值
                left++;
                right++;
            }
		}
		return result;
	}

	//超时...
	public int _numSubarrayProductLessThanK(int[] nums, int k) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += product(i, nums, k);
		}
		return result;
	}

	private int product(int i, int[] nums, int k) {
		int result = 0;
		if (i >= 0 && i < nums.length && nums[i] < k) {
			int subK = k / nums[i] + (k % nums[i] != 0 ? 1 : 0);
			return 1 + product(i + 1, nums, subK);
		} else {
			return result;
		}
	}

}
