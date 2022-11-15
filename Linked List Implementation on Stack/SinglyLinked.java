package com.acts.LinkedStack;

public class SinglyLinked implements SinglyLinkedListIntf {
	public Node head;

	public SinglyLinked() {
		this.head = null;
	}

	

	@Override
	public void addAtRear(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {

			current = current.next;

		}
		current.next = newNode;
	}

	

	
	@Override
	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}

		Node current = head;
		Node previous = null;

		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		if (head.next == null) {
			head = null;
			return;
		} else {
			previous.next = null;
		}
	}

	

	
	public void delete(int element) {
		Node current = head;
		Node previous = null;
		if (head.data == element) {
			current = head;
			head = current.next;
			current.next = null;
			return;
		}

		while (current != null) {

			if (current.data == element) {
				previous.next = current.next;
				current.next = null;
			}

			previous = current;
			current = current.next;
		}
	}

	@Override
	public void display() {
		Node current = head;
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		// System.out.print("head ");
		while (current != null) {
			System.out.print(current.data + "\t");
			current = current.next;
		}
		// System.out.print("tail");

	}

	@Override
	public boolean isEmpty() {
		if (head == null) {

			return true;
		}
		return false;

	}

	

}
