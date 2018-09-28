package com.algorithms.test;

import java.util.LinkedHashMap;
import java.util.List;

import com.algorithms.array.ArrayNesting;
import com.algorithms.array.ArrayPartition;
import com.algorithms.array.FindKthSmallestPairDistance;
import com.algorithms.array.FindMinimumInRotatedSortedArray;
import com.algorithms.array.GlobalAndLocalInversions;
import com.algorithms.array.MaximumAverageSubarrayI;
import com.algorithms.array.MaximumSwap;
import com.algorithms.array.MyCalendarI;
import com.algorithms.array.NonDecreasingArray;
import com.algorithms.array.PascalsTriangle;
import com.algorithms.array.PascalsTriangleII;
import com.algorithms.array.RangeModule;
import com.algorithms.array.SearchInRotatedSortedArray;
import com.algorithms.array.SearchInRotatedSortedArrayII;
import com.algorithms.array.SubarrayProductLessThanK;
import com.algorithms.array.SubarraySumEqualsK;
import com.algorithms.array.ThirdMaximumNumber;
import com.algorithms.array.TrappingRainWater;
import com.algorithms.array.ValidTriangleNumber;
import com.algorithms.backtracking.GenerateParentheses;
import com.algorithms.backtracking.Subsets;
import com.algorithms.bit.PowerOfTwo;
import com.algorithms.dp.MaximumSubarray;
import com.algorithms.dp.TargetSum;
import com.algorithms.dp.UniqueSubstringsInWraparoundString;
import com.algorithms.math.ArrangingCoins;
import com.algorithms.math.CountPrimes;
import com.algorithms.math.ExcelSheetColumnTitle;
import com.algorithms.math.FactorialTrailingZeroes;
import com.algorithms.math.MinimumMovesToEqualArrayElements;
import com.algorithms.math.NthDigit;
import com.algorithms.math.PerfectNumber;
import com.algorithms.math.PlusOne;
import com.algorithms.math.ReverseInteger;
import com.algorithms.math.Sqrt;
import com.algorithms.math.SumOfSquareNumbers;
import com.algorithms.math.UglyNumber;
import com.algorithms.math.ValidPerfectSquare;
import com.algorithms.utils.Print;

public class TestMain {
	// public static void main(String[] args) {
	// TrappingRainWater test = new TrappingRainWater();
	// System.out.println(test.trap(new int[] {5,2,1,2,1,5}));
	// }

	public static void main(String[] args) {
		FindTheDuplicateNumber test = new FindTheDuplicateNumber();
		System.out.println(test.findDuplicate(new int[] {4,3,1,4,2}));
		// System.out.println(10 & 124);
		// int[] a = new int[] {123,4,45,86,26,64,61,22,656,767,5};
		// quickSort(a);
		// printArray(a);
		// System.out.println(test.queryRange(2, 4));
		// System.out.println(test.queryRange(2, 9));
		// System.out.println(test.queryRange(4, 6));

		// System.out.println(test.queryRange(1, 6));
		// System.out.println(test.queryRange(1, 7));
	}

	public static void maxSum(int[] t) {

	}

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

	public static void quickSort(int[] a) {
		int left = 0, right = a.length;
		swap(a, left, right - 1);
	}

	private static void swap(int[] a, int left, int right) {
		if (left > right)
			return;
		int target = a[left];
		int i = left, j = right;
		while (i != j) {
			while (a[j] >= target && i < j)
				j--;
			while (a[i] <= target && i < j)
				i++;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[left] = a[i];
		a[i] = target;

		swap(a, left, i - 1);
		swap(a, i + 1, right);
	}
}
