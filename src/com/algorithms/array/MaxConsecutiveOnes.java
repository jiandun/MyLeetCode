package com.algorithms.array;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int startIndex = -1;
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            if(n == 1){
                if(startIndex == -1)
                    startIndex = i;
                result = Math.max(result, i - startIndex + 1);
            }else{
                startIndex = -1;
            }
        }
        return result;
	}
}
