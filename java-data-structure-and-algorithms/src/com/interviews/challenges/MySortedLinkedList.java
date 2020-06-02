package com.interviews.challenges;

public class MySortedLinkedList implements MyList {

	private Node node;
	private int[] integersInput;
	private int size;
	
	@Override
	public void add(int number) {
		int[] newArray = new int[size + 1];
		newArray[0] = number;
		if (integersInput != null && size > 0) {
			int[] array = this.toArray();
			for (int i = 0; i < array.length; i++)
				newArray[i+1] = array[i];
		}
		node = null; // clean current node attribute
		createLinkedList(newArray);
	}
	
	public MySortedLinkedList() {
		node = new Node();
	}
	
	public MySortedLinkedList(int[] integers) {
		integersInput = integers;
		createLinkedList(integers);
	}
	
	private void createLinkedList(int[] integers) {
		if (integers.length > 1)
			sort(integers);
		for (int i = 0; i < integers.length; i++) {
			Node curr = lastNode();
			curr.value = integers[i];
			curr.next = (i != integers.length - 1) ? new Node() : null;
		}
		integersInput = integers;
		size = integers.length;
	}
	
	private Node lastNode() {
		if (node == null)
			node = new Node();
		Node last = node;
		while (last.next != null) 
			last = last.next;
		return last;	
	}
	
	private void sort(int[] input) {
		for (int i = input.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)  {
				if (input[j] > input[j+1]) {
					int tmp = input[j];
					input[j] = input[j+1];
					input[j+1] = tmp;
				}
			}
		}
	}
	
	private int[] toArray() {
		if (integersInput != null)
			return integersInput;
		int index = 0;
		int[] output = new int[size == 0 ? 1 : size]; 
		Node list = node;
		while (list != null) {
			output[index] = list.value;
			list = list.next;
			index++;
		}
		return output;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("LinkedList [ ");
		for (Node n = node; n != null; n = n.next)
			sb.append("value=").append(n.value).append(n.next != null ? ", " : "");
		return sb.append(" ] size=").append(size).toString();
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@SuppressWarnings("unused")
	private class Node {
		int value;
		Node next;
		Node() {}
		Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
}
