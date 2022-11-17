package queue.doublyLinkedList.movie;

public interface QueueIntf<T> {
	public void push(T element);
	public void pop();
	public void peek();
	public void isEmtpy();
}
