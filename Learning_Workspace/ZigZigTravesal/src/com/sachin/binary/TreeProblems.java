package com.sachin.binary;

public class TreeProblems {
	
	public static class Node{
		public int value;
		public Node left;
		public Node right;
		
		public Node(int value) {
			this.value = value;
			this.left =null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(8);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.right.left = new Node(1);
		root.right.right= new Node(9);
		
		TreeProblems t = new TreeProblems();
		System.out.println("PreOrder Traversal");
		t.preOrderTraversal(root);
		System.out.println("\nInOrder Traversal");
		t.inorderTraversal(root);
		System.out.println("\nPostOrder Traversal");
		t.postOrderTraversal(root);
		System.out.println("\n Sum of tree");
		int count = t.sumOfTree(root);
		System.out.println(count);
	}

	private int sumOfTree(Node root) {
		// TODO Auto-generated method stub
		if(root == null)return 0;
		return sumOfTree(root.left) + root.value + sumOfTree(root.right);
	}

	private void postOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		if(root.left == null && root.right == null) {
			System.out.print(root.value + " ->");
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.value + "->");
	}

	private void inorderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root== null)return;
		if(root.left == null && root.right == null) {
			System.out.print(root.value + " ->");
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.value + " ->");
		inorderTraversal(root.right);
	}

	private void preOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root == null) return;
		if(root.left == null && root.right == null) {
			System.out.print(root.value + " ->");
			return;
		}
		System.out.print(root.value + " ->");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	

}
