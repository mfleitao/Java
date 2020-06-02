package com.interviews.challenges;

public class MyBinaryTree  {

	private Node root;
	private int size;
	
	public MyBinaryTree() {
	}

	public MyBinaryTree(int value) {
		root = new Node(value);
	}
	
	public Node root() {
		return root;
	}
	
	public void left(Node node, int value) {
		node.left = new Node(value);
	}
	
	public void right(Node node, int value) {
		node.right = new Node(value);
	}
	
	public void printPostOrder(Node root) {
		if (root != null) {
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.print(root.value + " ");
		}
	}
	
	public void printInOrder(Node root) {
		if (root != null) {
			printPostOrder(root.left);
			System.out.print(root.value + " ");
			printPostOrder(root.right);
		}
	}
	
	public void printPreOrder(Node root) {
		if (root != null) {
			System.out.print(root.value + " ");
			printPostOrder(root.left);
			printPostOrder(root.right);
		}
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@SuppressWarnings("unused")
	private class Node {
		int value;
		Node left, right;
		Node(int value) {
			this.value = value;
		}
	}
	
}
