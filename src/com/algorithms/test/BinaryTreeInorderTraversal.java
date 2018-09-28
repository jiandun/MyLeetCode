package com.algorithms.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode head = root;
		while(head != null ) {
			s.push(head);
			head = head.left;
		}
		
		while(!s.isEmpty()) {
			result.add(s.peek().val);
			TreeNode current = s.pop().right;
			while(current != null) {
				s.push(current);
				current = current.left;
			}
		}
		return result;
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
