package com.acts.singlylinkedList;

public interface SinglyLinkedListIntf {
	public void addAtFront(int element);
	public void addAtRear(int element);
	public void display();
	public boolean isEmpty();
	public void reverse();
	
	public void insert(int index,int element);
	public void insertionSort(int element);
	void deleteFirst();
	public boolean search(int element);
	

}
