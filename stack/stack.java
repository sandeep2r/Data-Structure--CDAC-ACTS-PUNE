package com.acts.stack;

import com.acts.exception.StackIsEmptyException;
import com.acts.exception.StackIsFullException;

public interface stack<T> {
	public void push(T element) throws StackIsFullException;

	public T pop() throws StackIsEmptyException;

	public boolean isFull() ;

	public boolean isEmpty();

}
