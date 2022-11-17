package queue.doublyLinkedList.movie;

public class DoublyLinkedList<T> implements DoublyLinkedIntf<T>{
	public Node<T> head;
	
	

	@Override
	public void addLast(T element) {
		Node<T> newNode = new Node<T>(element);
		if(head==null) {
			head = newNode;
			return;
		}
		Node<T> current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = newNode;
		newNode.previous = current;
	}

	@Override
	public T deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return null;
		}
		T temp = head.data;
		head = head.next;
		return temp;
	}

	@Override
	public void peek() {
		
		System.out.println(head.data+" ");
	}

	

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		Node<T> current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	

}
