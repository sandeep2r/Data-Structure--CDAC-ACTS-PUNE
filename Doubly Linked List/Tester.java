package com.acts.doublylinkedlist;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		do {
//			"3.Insert at any random location\n  
//	       7.Search\n
			System.out.println("1.Insert in begining");
			System.out.println("2.Insert at last");
			System.out.println("3.Insert at given index location");
			System.out.println("4.Display forward");
			System.out.println("5.Display Backward");
			System.out.println("6.Delete from Beginning");
			System.out.println("7.Delete from last");
			System.out.println("8.Delete the node after given element");
			System.out.println("9.search given element");
			System.out.println("10.exit");
			System.out.println("11.Merge two sorted doubly linked list");
			System.out.println("12.Insertion Sort");
			choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1:System.out.println("Enter the elements");
				DoublyLinkedList dlist1 = new DoublyLinkedList();
				for (int i = 0; i < 5; i++) {
					dlist1.addAtFront(scan.nextInt());
				}
				dlist1.displayForward();
				dlist1.displayReverse();
				break;
			case 2:
				System.out.println("Enter the elements");
				DoublyLinkedList dlist2 = new DoublyLinkedList();
				for (int i = 0; i < 5; i++) {
					dlist2.addAtRear(scan.nextInt());
				}
				dlist2.displayForward();
				dlist2.displayReverse();
				break;
				
			case 3:
				System.out.println("Insert Index and element you want to add");
				dlist.insert(scan.nextInt(), scan.nextInt());
				dlist.displayForward();
				dlist.displayReverse();
				
				
				
				break;
			case 4:
				dlist.addAtFront(10);
				dlist.addAtFront(11);
				dlist.addAtFront(12);
				dlist.addAtFront(13);
				dlist.addAtFront(14);
				dlist.addAtFront(15);
				System.out.println("Printing forward");
				dlist.displayForward();
			
				
				break;
			case 5:
				dlist.addAtFront(10);
				dlist.addAtFront(11);
				dlist.addAtFront(12);
				dlist.addAtFront(13);
				dlist.addAtFront(14);
				dlist.addAtFront(15);
				System.out.println("Backward Printing");
				dlist.displayReverse();
				break;
			case 6:
				dlist.deleteFirst();
				dlist.displayForward();
				break;
			
			case 7:
				dlist.deleteLast();
				dlist.displayForward();
				break;
			case 8:
				System.out.println("Enter the Element");
				dlist.delete(scan.nextInt());
				dlist.displayForward();
				break;
			case 9:
				System.out.println("Enter the element you want to search");
				System.out.println("Element Found : "+dlist.search(scan.nextInt()));
				
				break;
			case 10:
				System.exit(0);
				break;
			case 12:
				dlist.insertionSort(22);
				dlist.insertionSort(-1);
				dlist.insertionSort(10);
				dlist.insertionSort(3);
				dlist.insertionSort(225);
			dlist.displayForward();
			dlist.displayReverse();
				
				break;
			default:
				break;
			}
		} while (choice!=0);
		
		
		scan.close();
	}

}
