package linkedListOfVehical;

public class DoublyLinkedList<T> implements LinkedListIntf<T> {
	public Node<T> head;
	public Node<T> tail;
	
	public DoublyLinkedList() {
		super();
	}

	@Override
	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
			return;
		}
		head.previous = newNode;
		newNode.next = head;
		head = newNode;

	}

	@Override
	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head==null) {
			head= newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;

	}

	@Override
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head==tail) {
			head = null;
			tail = null;
			return;
		}
		head = head.next;

	}

	@Override
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head==tail) {
			head = null;
			tail = null;
			return;
		}
		tail = tail.previous;
		tail.next = null;

	}

	

	@Override
	public void print() {
		Node<T> current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

	@Override
	public void printReverse() {
		Node<T> current = tail;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.previous;
		}

	}

}
