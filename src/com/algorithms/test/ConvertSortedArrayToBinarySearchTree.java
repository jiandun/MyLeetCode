package com.algorithms.test;

import com.algorithms.utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return helper(nums, 0, nums.length - 1);
	}

	private TreeNode helper(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (end - start) / 2 + start;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, start, mid - 1);
		node.right = helper(nums, mid + 1, end);
		return node;
	}
}
