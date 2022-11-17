package queue.doublyLinkedList.movie;

public class Queue<T> {
	public DoublyLinkedList<T> list;

	public Queue() {
		list = new DoublyLinkedList<T>();
	}

	public void push(T e) {
		list.addLast(e);

	}

	public T pop() {
		return list.deleteFirst();
	}

	public void display() {
		list.display();
	}
	
	public void peek() {
		 list.peek();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public String toString() {
		return "Queue [list=" + list + "]";
	}

}