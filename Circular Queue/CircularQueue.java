package com.acts.circularQueue;

import java.util.Arrays;

public class CircularQueue implements QueueIntf {
	private Object[] queueData;
	private int front;
	private int rear;
	private int queuesize;
	
	public CircularQueue(int size) {
		this.queueData = new Object[size];
		this.queuesize = size;
		this.front = 0;
		this.rear = 0;
	}
	
	@Override
	public void AddQ(int element) {
	if(isFull()) {
		return;
	}
	
	rear = (rear + 1 ) % queuesize;
	queueData[rear] = element;
		
	}

	@Override
	public void DeleteQ() {
		if(isEmpty()) {
			return;
		}
		queueData[front] =Integer.MIN_VALUE;
		front = (front + 1 ) % queuesize;
		
	
		
	}

	@Override
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if((rear + 1) % queuesize == front) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "circularQueue [queueData=" + Arrays.toString(queueData) + ", front=" + front + ", rear=" + rear
				+ ", queuesize=" + queuesize + "]";
	}

	

}
