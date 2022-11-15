package com.acts.LinkedStack;

public class Stack extends SinglyLinked implements StackIntf{

	@Override
	public void push(int data) {
		addAtRear(data);
		
	}

	@Override
	public void pop() {
		deleteLast();
		
	}

}
