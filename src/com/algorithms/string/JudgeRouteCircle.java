package com.algorithms.string;

public class JudgeRouteCircle {
	public boolean judgeCircle(String moves) {
		char[] list = moves.toCharArray();
		int x = 0, y = 0;
		for (char i : list) {
			switch (i) {
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			}
		}
		return x == 0 && y == 0;
	}
}
