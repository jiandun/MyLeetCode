package com.algorithms.test;

import java.util.ArrayList;

public class LeafSimilarTrees {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		ArrayList<Integer> leafs1 = new ArrayList<>();
		ArrayList<Integer> leafs2 = new ArrayList<>();

		preOrder(root1, leafs1);
		preOrder(root2, leafs2);
		if(leafs1.size() == leafs2.size()) {
			for(int i = 0 ; i < leafs1.size() ; i++) {
				if(leafs1.get(i) != leafs2.get(i))
					return false;
			}
		}else {
			return false;
		}
		
		return true;
	}

	private void preOrder(TreeNode root, ArrayList<Integer> leafs) {
		if(root == null) {
			return;
		}else {
			if(root.left ==null && root.right == null) {
				leafs.add(root.val);
			}
			else {
				preOrder(root.left, leafs);
				preOrder(root.right, leafs);
			}
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