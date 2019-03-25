package com.qinhan.definedlist;

public class App {
	public static void main(String[] args) {
		MyLinkList mlist=new MyLinkList();
		//这里是尾插法，所以是有序的，如果是头插法，则是无序的。
		mlist.addNode(1, 1111);
		mlist.addNode(2, 2222);
		mlist.addNode(7, 7777);
		Node newNode=new Node(3,3333);
		System.out.println(mlist.insertNode(newNode, 2));
		mlist.delNode(3);
		MyLinkList.traverse(mlist);
		System.out.println("2位置上的节点:"+mlist.getNode(2));
		
	}
}
