package com.acts.linkedQueue;

public class Queue extends SinglyLinked implements QueueIntf {

	@Override
	public void insert(int data) {
		addAtRear(data);
		
	}

	@Override
	public void delete() {
		deleteFirst();
		
	}

	@Override
	public String toString() {
		return "Queue []";
	}

}
