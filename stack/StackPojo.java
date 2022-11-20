package com.acts.stack;

import java.util.Arrays;

import com.acts.exception.StackIsEmptyException;
import com.acts.exception.StackIsFullException;

public class StackPojo<T> implements stack<T>{
	Object[] stackArray;
	int top;
	int size ;
	
	

	public StackPojo(int size) {
		super();
		this.size = size;
		this.stackArray = new Object[size];
		this.top = -1;
	}
	@Override
	public void push(Object element) throws StackIsFullException {
	if(isFull())
		throw new StackIsFullException("stack is full");
	else {
		++top;
		stackArray[top]= element;
	}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() throws StackIsEmptyException{
		if(isEmpty()) {
			throw new StackIsEmptyException("stack is empty");
		}else {
			stackArray[top]=null;
			--top;
			return (T) stackArray[top];
		}
		
	}

	@Override
	public boolean isFull()  {
		if(top==(size-1)) {
		return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty()  {
		if(top==-1) {
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "StackPojo [stackArray=" + Arrays.toString(stackArray) + ", top=" + top + ", size=" + size + "]";
	}

	
}
