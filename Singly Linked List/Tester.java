package com.acts.singlylinkedList;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {

		SinglyLinked slist = new SinglyLinked();
		slist.addAtFront(11);
		slist.addAtFront(22);
		slist.addAtFront(33);
		slist.addAtFront(44);
		slist.addAtFront(55);

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add at Front and display");
			System.out.println("2.Add at Rear and display");
			System.out.println("3.Insert at any random location");
			System.out.println("4.Insertion sort");
			System.out.println("5.Delete from Beginning");
			System.out.println("6.Delete from last");
			System.out.println("7.Delete element ");
			System.out.println("8.Search for an element");
			System.out.println("9.show");
			System.out.println("10.reverse singly linked list");
			//System.out.println("11.merge two sorted linked list");
			System.out.println("12.exit");
			choice = scan.nextInt();
			scan.nextLine();
			switch (choice) {
			case 1:
				SinglyLinked slist1 = new SinglyLinked();
				System.out.println("Enter  5  element");
				for (int i = 0; i < 5; i++) {
					slist1.addAtFront(scan.nextInt());
				}
				slist1.display();
				System.out.println();

				break;
			case 2:
				SinglyLinked slist2 = new SinglyLinked();
				System.out.println("Enter 5 elements");
				for (int i = 0; i < 5; i++) {
					slist2.addAtRear(scan.nextInt());
				}
				slist2.display();
				System.out.println();

				break;
			case 3:
				System.out.println("Insert the indext and element");
				slist.insert(scan.nextInt(), scan.nextInt());
				slist.display();
				System.out.println();
				break;
			case 4:
				SinglyLinked slist4 = new SinglyLinked();
				System.out.println("Enter  element");
				for (int i = 0; i < 10; i++) {
					slist4.insertionSort(scan.nextInt());
				}
				slist4.display();
				System.out.println();
				
				break;
			case 5:
				slist.deleteFirst();
				slist.deleteFirst();
				slist.deleteFirst();
				slist.deleteFirst();
//				slist.deleteFirst();
				slist.display();
				System.out.println();
				break;

			case 6:
				slist.deleteLast();
				slist.deleteLast();
				slist.deleteLast();
				slist.deleteLast();
				// slist.deleteLast();
				slist.display();
				System.out.println();
				break;
			case 7:
				System.out.println("Enter the element you want to delete");
				slist.delete(scan.nextInt());
				slist.display();
				System.out.println();
				break;
			case 8:
				System.out.println("Enter the element to be search");
				System.out.println(slist.search(scan.nextInt()));;
				System.out.println();
				break;
			case 9:
				slist.display();
				System.out.println();
				break;
				
			case 10:
				System.out.print("Original list : ");
				slist.display();
				System.out.println();
				slist.reverse();
				System.out.print("reverser list : ");
				slist.display();
				System.out.println();
			
			
			break;
			case 12:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (choice != 0);

		scan.close();

	}

}
