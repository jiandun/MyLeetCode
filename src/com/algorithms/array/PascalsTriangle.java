package com.algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows > 0) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			result.add(row);
		}
		if (numRows > 1) {
			for(int currentRow = 2 ; currentRow <= numRows ; currentRow++) {
				List<Integer> row = new ArrayList<Integer>();
				List<Integer> preRow = result.get(currentRow - 2);
				for (int i = 0; i < currentRow; i++) {
					int left = (i - 1) < 0 ? 0 : preRow.get(i - 1);
					int right = i >= (currentRow - 1) ? 0 : preRow.get(i);

					row.add(left + right);
				}
				
				result.add(row);
			}
		}
		return result;
	}
}
