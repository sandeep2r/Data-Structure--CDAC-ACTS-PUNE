package com.acts.queue;

public interface Queue <T>{
	
	public void Add(T element);
	public T Delete();
	public boolean isFull();
	public boolean isEmpty();

}
//public void push(T element) throws StackIsFullException;