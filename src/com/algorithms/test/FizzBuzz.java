package com.algorithms.test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			String target = "";
			if (i % 15 == 0)
				target = "FizzBuzz";
			else if (i % 5 == 0)
				target = "Buzz";
			else if (i % 3 == 0)
				target = "Fizz";
			else
				target = i + "";
			result.add(target);
		}
		return result;
	}
}
