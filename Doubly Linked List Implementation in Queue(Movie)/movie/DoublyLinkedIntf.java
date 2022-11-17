package queue.doublyLinkedList.movie;

public interface DoublyLinkedIntf<T> {
	public void addLast(T element);
	public T deleteFirst();
	public void peek();
	public boolean isEmpty();
	public void display();

}
