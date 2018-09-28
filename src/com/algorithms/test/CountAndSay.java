package com.algorithms.test;

public class CountAndSay {
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		} else {
			char[] preStr = countAndSay(n - 1).toCharArray();
			StringBuilder builder = new StringBuilder();
			char value = preStr[0];
			int count = 1;
			for(int i = 1 ; i < preStr.length; i++) {
				if(preStr[i] == value) {
					count++;
				}else {
					builder.append(count);
					builder.append(value);
					
					value = preStr[i];
					count = 1;
				}
			}
			builder.append(count);
			builder.append(value);
			
			return builder.toString();
		}
	}
}
