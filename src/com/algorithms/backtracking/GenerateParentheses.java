package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		backtrack(result, "", 0, 0, n);
		return result;
	}

	private void backtrack(List<String> result, String target, int l, int r, int n) {
		if (l == n && r == n) {
			result.add(target);
		} else if (l == n) {
			backtrack(result, target + ")", l, r + 1, n);
		} else {
			if(l > r){
				backtrack(result, target + "(", l+1, r, n);
				backtrack(result, target + ")", l, r + 1, n);
			}else {
				backtrack(result, target + "(", l+1, r, n);
			}
		}
	}
}
