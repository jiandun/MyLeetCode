package com.algorithms.test;

import java.util.List;
import com.algorithms.array.*;

public class TestMain {
	public static void main(String[] args) {	
		ArrayPartition t = new ArrayPartition();
		System.out.println(t.arrayPairSum(new int[] {45,345}));
	}
	
	//测试Pascal's Triangle II
	public static void testPascalsTriangleII() {
		PascalsTriangleII t = new PascalsTriangleII();
		printList(t.getRow(10));
	}
	
	//测试Plus One
	public static void testPlusOne() {
		int[] test = new int[] {1,9};
		PlusOne t = new PlusOne();
		printArray(t.plusOne(test));
	}
	
	//测试Pascal's Triangle
	public static void testPascalsTriangle() {
		PascalsTriangle t = new PascalsTriangle();
		printNestedList(t.generate(30));
	}
	
	public static void printArray(int[] result) {
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]+",");
		}
		System.out.println();
	}
	
	public static void printList(List<Integer> list) {
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println();
	}
	
	public static void printNestedList(List<List<Integer>> list) {
		for(int i = 0 ; i < list.size() ; i++) {
			List<Integer> small = list.get(i);
			printList(small);
		}
	}
}
