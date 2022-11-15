package com.acts.doublycircular;

public class CircularDoublyList implements CircularDoublyIntf {
	public Node head;

	public CircularDoublyList() {
		this.head = new Node();
		// this.head.data = 0;
		this.head.next = head;
		this.head.previous = head;

	}

	@Override
	public void insertion_beginning(int element) {
		Node newNode = new Node(element);
		Node start = head;
		head.data = element;

		if (start.previous == head) {
			start.previous = newNode;
			newNode.previous = start;
			start.next = newNode;
			newNode.next = start;
			start = newNode;
			head = start;
			return;
		}
		Node last = start.previous;
		start.previous = newNode;
		newNode.previous = last;
		last.next = newNode;
		newNode.next = start;
		start = newNode;
		head = start;

	}

	@Override
	public void insertion_last(int element) {
		Node newNode = new Node(element);
		Node start = head;
		head.data = element;
		if (head.previous == head) {
			start.next = newNode;
			newNode.next = start;
			start.previous = newNode;
			newNode.previous = start;
			head = start;
			return;
		}
		Node last = head.previous;
		last.next = newNode;
		newNode.next = start;
		newNode.previous = last;
		start.previous = newNode;
		last = newNode;
		// head = last.next;

	}

	@Override
	public void deletion_beginning() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		head.previous.next = head.next;
		head.next.previous = head.previous;
		head = head.next;
	}

	@Override
	public void deletion_last() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		Node last = head.previous;
		last.previous.next = head;
		last.next.previous = last.previous;
		last = last.previous;

	}

	@Override
	public void displayForward() {
		Node current = head.next;
		System.out.print("[null,");
		while (current != head) {
			System.out.print(current.data + ",");
			current = current.next;
		}
		System.out.println("null]");
	}

	@Override
	public void displayBackward() {
		Node current = head.previous;
		System.out.print("[null,");
		while (current != head) {
			System.out.print(current.data + ",");
			current = current.previous;
		}
		System.out.println("null]");
	}

	@Override
	public void head() {
		System.out.println(head.data);
	}

	@Override
	public boolean search(int element) {
		Node current = head.next;
		while (current != head) {
			if(current.data==element) {

				return true;
			}
			current = current.next;
		}
		return false;

	}
	
	@Override
	public void Insert(int element) {
		Node newNode = new Node();
		newNode.data = element;
		Node current = head.next;

		while (current != head) {
			if (current.data > element) {
				break;
			}
			current = current.next;
		}
		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;
	}

}
