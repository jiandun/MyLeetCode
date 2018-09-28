package com.algorithms.test;

//BST: binary search tree, means left.val < head.val < right.val
public class SearchInABinarySearchTree {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
			return null;
		if (root.val == val) {
			return root;
		} else if (root.val > val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
