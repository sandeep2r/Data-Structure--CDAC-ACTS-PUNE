package com.acts.queue;

public class QueueTester {
	public static void main(String[] args) {
		
		QueuePojo<Integer> queuepojo = new QueuePojo<Integer>(5);
		queuepojo.Add(10);
		queuepojo.Add(20);
		queuepojo.Delete();
		queuepojo.Delete();
		queuepojo.Add(30);
		queuepojo.Add(40);
		queuepojo.Add(40);
		
	
	System.out.println(queuepojo);
	queuepojo.Delete();
	queuepojo.Delete();
	queuepojo.Delete();
	System.out.println(queuepojo);
	System.out.println(queuepojo.isFull());
	System.out.println(queuepojo.isEmpty());
	}

}
