package com.algorithms.test;

import java.util.List;

import com.algorithms.array.ArrayNesting;
import com.algorithms.array.ArrayPartition;
import com.algorithms.array.FindKthSmallestPairDistance;
import com.algorithms.array.GlobalAndLocalInversions;
import com.algorithms.array.MaximumAverageSubarrayI;
import com.algorithms.array.MaximumSwap;
import com.algorithms.array.MyCalendarI;
import com.algorithms.array.NonDecreasingArray;
import com.algorithms.array.PascalsTriangle;
import com.algorithms.array.PascalsTriangleII;
import com.algorithms.array.PlusOne;
import com.algorithms.array.SearchInRotatedSortedArray;
import com.algorithms.array.SearchInRotatedSortedArrayII;
import com.algorithms.array.SubarrayProductLessThanK;
import com.algorithms.array.ThirdMaximumNumber;
import com.algorithms.array.ValidTriangleNumber;
import com.algorithms.bit.PowerOfTwo;
import com.algorithms.dp.TargetSum;
import com.algorithms.dp.UniqueSubstringsInWraparoundString;
import com.algorithms.math.ArrangingCoins;
import com.algorithms.math.PerfectNumber;
import com.algorithms.math.SumOfSquareNumbers;

public class TestMain {
	public static void main(String[] args) {
		ArrayNesting test = new ArrayNesting();
		System.out.println(test.arrayNesting(new int[] { 5, 4, 0, 3, 1, 6, 2 }));
	}

	// public static void main(String[] args) {
	// int result = 32;
	// int test = result >> 2;
	// System.out.println(~test);
	// System.out.println((test & result));
	// }

	public static void testY(double min, double max, int steps) {
		if (max - min > 1) {
			min = Math.floor(min);
			max = Math.ceil(max);
		}

		double corStep = (max - min) / steps;
		double magnitude = Math.ceil(Math.log(corStep) / Math.log(10));
		double formatStep = corStep / Math.pow(10, magnitude);
		double[] list = { 0.05, 0.1, 0.2, 0.4, 0.5, 1, 1.5, 2, 2.5 };
		double targetStep = 0.05;
		for (int i = 1; i < list.length; i++) {
			if (formatStep >= list[i - 1] && formatStep < list[i]) {
				targetStep = list[i - 1];
			}
		}
		targetStep *= Math.pow(10, magnitude);
		System.out.println(corStep + "  " + magnitude + "  " + formatStep + "  " + targetStep);

		double start = (Math.floor(min / targetStep)) * targetStep;
		double end = (Math.ceil(max / targetStep)) * targetStep;
		for (double i = start; i <= end; i += targetStep) {
			System.out.print(roundDouble(i, 1 - magnitude) + ", ");
		}
	}

	public static double roundDouble(double value, double bits) {
		double n = Math.max(bits, 0);
		return Math.round(value * Math.pow(10, n)) / Math.pow(10, n);
	}

	public static void testArrayPartition() {
		ArrayPartition t = new ArrayPartition();
		System.out.println(t.arrayPairSum(new int[] { 45, 345 }));
	}

	// 测试Pascal's Triangle II
	public static void testPascalsTriangleII() {
		PascalsTriangleII t = new PascalsTriangleII();
		printList(t.getRow(10));
	}

	// 测试Plus One
	public static void testPlusOne() {
		int[] test = new int[] { 1, 9 };
		PlusOne t = new PlusOne();
		printArray(t.plusOne(test));
	}

	// 测试Pascal's Triangle
	public static void testPascalsTriangle() {
		PascalsTriangle t = new PascalsTriangle();
		printNestedList(t.generate(30));
	}

	public static void printArray(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.println();
	}

	public static void printList(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
	}

	public static void printNestedList(List<List<Integer>> list) {
		for (int i = 0; i < list.size(); i++) {
			List<Integer> small = list.get(i);
			printList(small);
		}
	}
}
