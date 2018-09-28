package com.algorithms.test;

import java.util.Stack;

import com.algorithms.utils.TreeNode;

public class KthSmallestElementInABST {
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int index = 0, result = 0;
		TreeNode head = root;
		while(head != null) {
			stack.push(head);
			head = head.left;
		}
		while(!stack.isEmpty() && index < k) {
			head = stack.pop();
			result = head.val;
			index++;
			head = head.right;
			while(head != null) {
				stack.push(head);
				head = head.left;
			}
		}
		return result;
	}

}
