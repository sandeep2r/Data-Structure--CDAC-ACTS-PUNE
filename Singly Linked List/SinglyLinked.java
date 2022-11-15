package com.acts.singlylinkedList;

public class SinglyLinked implements SinglyLinkedListIntf {
	public Node head;

	public SinglyLinked() {
		this.head = null;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node(element);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

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
	public void insert(int index, int element) {
		if (isEmpty() || index==0) {
			addAtFront(element);
			return;
		}
		Node current = head;
		for (int i = 0; i < index - 1 && current != null; i++) {
			current = current.next;
		}

		if (current == null) {
			System.out.println("Index not found");
		} else {
			Node newNode = new Node(element);
			newNode.next = current.next;
			current.next = newNode;
		}
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

	@Override
	public void insertionSort(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
			return;
		}
		if (newNode.data < head.data) {
			newNode.next = head;
			head = newNode;

		} else {
			Node current = head;
			Node previous = null;
			while (current != null) {
				if (current.data > newNode.data) {
					break;
				}
				previous = current;
				current = current.next;
			}
			if (current == null) {
				previous.next = newNode;
			}
			previous.next = newNode;
			newNode.next = current;

		}

	}

	@Override
	public boolean search(int element) {
		Node current = head;
		while (current != null) {
			if (current.data == element) {
				return true;
			}
			current = current.next;
		}
		return false;
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

	@Override
	public void reverse() {
		Node current = head;
		Node previous = null;
		Node temp = null;
		if(isEmpty()) {
			System.out.println("list is emtpy");
			return;
		}
		if(head.next==null) {
			return;
		}
		if(current.next==null) {
			head = previous;
		}
		while(current != null) {
		temp = current.next;
		current.next = previous;
		previous = current;
		current = temp;
	
		}
		head = previous;
	}

}
