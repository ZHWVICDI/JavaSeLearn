package com.qinhan.definedlist;

public class MyLinkList {
	//带头节点的链表
	private Node head;
	public MyLinkList() {
		head=null;
	}
	//添加节点  尾插法
	public void addNode(int key,int value) {
		if(head==null) {
			head=new Node(key,value);
		}else {
			Node current=head;//当前节点指向头节点
			//移动到最后一个节点 
			while(current.next!=null) {
				current=current.next;
			}
			current.next=new Node(key,value);
		}
	}
	//查询节点 根据key
	public Node getNode(int key) {
		Node c=head;
		if(c.key==key) {
			return c;
		}else {
			//遍历
			while(c.key!=key) {
				c=c.next;
			}
		}
		return c;
	}
	//删除节点  返回boolean
	
	public boolean delNode(int key) {
		Node c=head;
		Node p;
		if(head==null) {
			return false;
		}else if(head.key==key) {
			head=head.next;
			return true;
		}else {
			c=head.next;
			p=head;
			while(c.key!=key) {
				c=c.next;
				p=p.next;
			}
			if(c!=null) {
				p.next=c.next;
				return true;
			}
		}
		return false;
	}
	//插入节点   将某个节点插入到指定位置
	public boolean insertNode(Node s,int index) {
		Node p=head;
		if(p==null||index==0) {
			s.next=p;
			p=s;
			return true;
		}else {
			while(p.next!=null&&index-->0) {
				p=p.next;
			}
			s.next=p.next;
			p.next=s;
			return true;
		}
	}
	//遍历节点
	public static void traverse(MyLinkList mylist) {
		Node c=mylist.head;
		while(c!=null) {
			System.out.println(c);
			c=c.next;
		}
	}
}
