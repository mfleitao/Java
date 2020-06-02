package com.algorithms;

public class MergeTwoSortedLists {
	
	public static void main(String[] args) {
//		Input:  1->2->4, 1->3->4 
//		Output: 1->1->2->3->4->4
		NodeObject l1 = new NodeObject(1, new NodeObject(2, new NodeObject(4)));
		NodeObject l2 = new NodeObject(1, new NodeObject(3, new NodeObject(4)));
		MergeTwoSortedLists m = new MergeTwoSortedLists();
		System.out.println(m.mergeTwoLists(l1, l2).toString());
	}
	
	public NodeObject mergeTwoLists(NodeObject l1, NodeObject l2) {
		NodeObject output = new NodeObject();
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				insertNode(output, l1.val);
				l1 = l1.next;
			} else {
				insertNode(output, l2.val);
				l2 = l2.next;
			}
		}
		return output;
	}
	
	// Node [val=0, next=Node [val=1, next=Node [val=2, next=Node [val=4, next=null]]]]
	private void insertNode(NodeObject linkedList, int val) {
		if (linkedList.val == 0)
			linkedList.val = val;
		else {
			NodeObject last = linkedList;
			while (last.next != null)
				last = last.next;
			last.next = new NodeObject(val);
		}
	}
	
}

class NodeObject {
	int val;
	NodeObject next;
	NodeObject() {}
	NodeObject(int val) {
		this.val = val;
	}
	NodeObject(int val, NodeObject next) {
		this.val = val;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [val=" + val + ", next=" + next + "]";
	}
	public String onlyValues() {
		StringBuilder sb = new StringBuilder();
		NodeObject n = this;
		while (n != null) {
			sb.append("[val = "+ n.val +"][node = "+ n.next +"]\n");
			n = n.next;
		}
		return sb.toString();
	}
}
