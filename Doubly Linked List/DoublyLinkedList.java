package com.acts.doublylinkedlist;

public class DoublyLinkedList implements DoublyListIntf {
	public Node head;
	public Node tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node(element);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}

		head.previous = newNode;
		newNode.next = head;
		head = newNode;

	}

	@Override
	public void addAtRear(int element) {
		Node newNode = new Node(element);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;

	}

	@Override
	public void displayForward() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();

	}

	@Override
	public void displayReverse() {
		Node current = tail;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println();
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void insert(int index, int element) {
		// Insert at given index location
		if (isEmpty() || index == 0) {
			addAtFront(element);
			return;
		}
		Node current = head;
		Node temp = null;

		for (int i = 0; i < index - 1 && current != null; i++) {
			current = current.next;
		}
		if (current == null) {
			System.out.println("Index not found");
		} else {
			Node newNode = new Node(element);
			temp = current.next;
			current.next = newNode;
			newNode.previous = current;
			newNode.next = temp;
			if (temp != null) {
				temp.previous = newNode;
			} else {
				tail = newNode;
			}
		}

	}

	@Override
	public void insertionSort(int element) {
		Node newNode = new Node(element);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			return;
		}
		if (head.data > newNode.data) {
			head.previous = newNode;
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
				newNode.previous = previous;
				tail = newNode;
				return;
			}
			previous.next = newNode;
			newNode.previous = previous;
			newNode.next = current;
			current.previous = newNode;
		}
	}

	@Override
	public void deleteFirst() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		head = head.next;
		head.previous = null;
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

	@Override
	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		if (head == tail) {
			tail = null;
			head = null;
			return;
		}

		tail = tail.previous;
		tail.next = null;
	}

	@Override
	public void delete(int element) {
		Node current = head;
		Node previous = null;

		while (current != null) {
			if (head.data == element) {
				head = head.next;
				head.previous = null;
				break;
			}
			if (tail.data == element && tail.next == null) {
				tail = tail.previous;
				tail.next = null;
				break;
			}
			if (current.data == element) {
				previous.next = current.next;
				current.next.previous = previous;
				break;
			}

			previous = current;
			current = current.next;
		}

	}

}
