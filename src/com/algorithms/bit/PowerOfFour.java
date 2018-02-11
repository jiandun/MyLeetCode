package com.algorithms.bit;

/**
 * 4的指数有3个特点：
 * 1.大于0
 * 2.bit位上有且只有一个1，所以-1之后做&必然等于0
 * 3.唯一的一个1必然是在偶数位上，所以和010101...101做&之后不能等于0
 * @author maple
 *
 */
public class PowerOfFour {
	public boolean isPowerOfFour(int num) {
		return (num > 0) && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
	}
}
