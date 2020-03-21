package com.sachin.binary;

import java.util.Stack;

class Node{
	int value;
	Node leftChild;
	Node rightChild;
	
	Node(int value){
		this.value = value;
		this.leftChild=null;
		this.rightChild=null;
	}
}

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		
		root = new Node(20);
		root.leftChild= new Node(21);
		root.rightChild= new Node(23);
		root.leftChild.leftChild = new Node(1);
		//root.leftChild.rightChild = new Node
		root.rightChild.leftChild = new Node(3);
		root.rightChild.rightChild = new Node(8);
		//addValue(root, 20);
		printZigZag(root);
	}

	private static void printZigZag(Node root) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		
		Stack<Node> cl = new Stack<Node>();
		Stack<Node> nl = new Stack<Node>();
		
		cl.push(root);
		
		boolean flag = true;
		
		while(!cl.isEmpty()) {
			Node node =cl.pop();
			System.out.print(node.value + "->");
			
			if(flag) {
				
			if(node.leftChild != null)
				nl.push(node.leftChild);
			
			if(node.rightChild != null)
				nl.push(node.rightChild);
			
			}else {
				if(node.rightChild != null)
					nl.push(node.rightChild);
				
				if(node.leftChild != null)
					nl.push(node.leftChild);
			}
			
			if(cl.empty()) {
				Stack<Node> temp = cl;
				cl=nl;
				nl = temp;
				flag =!flag;
			}
		}
	}

	/*private static void addValue(Node root, int value) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = new Node(value);
		}
		Node current = root;
		while(current != null) {
			if(current.leftChild != null) {
				
			}
			
		}
		current.leftChild= new Node(value);
	}*/

}
