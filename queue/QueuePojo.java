package com.acts.queue;

import java.util.Arrays;

public class QueuePojo<T> implements Queue<T> {
	Object[] Queue;
	int front;
	int rear;
	int size;
	
	public QueuePojo(int size) {
		super();
		this.size = size;
		this.Queue = new Object[size];
		this.front = -1;
		this.rear = -1;

	}
	@Override
	public void Add(Object element) {
		if(-1==front) {
			front++;
		}
		
		if(isFull()) {
			System.out.println("queue is full  ");
		}
		
		else {
			++rear;
			Queue[rear] = element;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T Delete() {
		Object temp = null;
		if(isEmpty()){
			System.out.println("queue is empty");
		}else{
		temp=Queue[front];
		Queue[front]=null;
		front++;
		
		}
		return (T) temp;
	}

	@Override
	public boolean isFull() {
		if(rear==(size-1)) {
			return true;
			}
			return false;
	}

	@Override
	public boolean isEmpty() {
		if(rear==-1||front>rear) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "QueuePojo [Queue=" + Arrays.toString(Queue) + ", front=" + front + ", rear=" + rear + ", size=" + size
				+ "]";
	}

	

	

}
