package com.algorithms.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Print {
	public static void printArray(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println();
	}

	public static void printList(List<?> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).toString() + ",");
		}
		System.out.println();
	}
	
	public static void printMap(Map<?, ?> list) {
		Iterator<?> ite= list.entrySet().iterator();
		while(ite.hasNext()) {
			Entry<?, ?> e = (Entry<?, ?>) ite.next();
			System.out.println(e.getKey().toString()+" , "+e.getValue().toString());
		}
	}

	public static void printNestedList(List<List<Integer>> list) {
		for (int i = 0; i < list.size(); i++) {
			List<Integer> small = list.get(i);
			printList(small);
		}
	}
	
	public static void printNestedStrList(List<List<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			List<String> small = list.get(i);
			printList(small);
		}
	}


	public static void printNestedList(ListNode node) {
		ListNode t = node;
		while(t != null) {
			System.out.print(t.val+", ");
		}
		System.out.println();
	}

}
