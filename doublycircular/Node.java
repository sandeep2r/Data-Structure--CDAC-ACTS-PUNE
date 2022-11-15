package com.acts.doublycircular;

public class Node {
	 public int data;
	 public Node next;
	 public Node previous;
	 public Node() {
		 super();
	 }
	 
	 public Node(int data) {
		 this.data = data;
		 this.next = null;
		 this.previous = null;
	 }

}
