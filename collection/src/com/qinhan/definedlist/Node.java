package com.qinhan.definedlist;

public class Node {
	public int key;
	public int value;
	public Node next;
	public Node(int key,int value) {
		this.key=key;
		this.value=value;
		next=null;
	}
	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value  + "]";
	}
	
}
