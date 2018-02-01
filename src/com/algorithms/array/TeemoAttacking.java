package com.algorithms.array;

public class TeemoAttacking {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length <= 0)
            return 0;
        int result = 0, state = -1;
		for (int i = 0; i < timeSeries.length; i++) {
			//timeSeries第一个值可能是0，这里需要写>=
			if(state >= 0) {
				int gap = timeSeries[i] - state;
				result += (gap >= duration) ? duration : gap;
			}
			state = timeSeries[i];
		}
		return result + duration;
	}
}
