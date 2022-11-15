package com.acts.linkedQueue;

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
	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		Node current = head;
		head = current.next;
		current.next = null;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {

			return true;
		}
		return false;

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

}
