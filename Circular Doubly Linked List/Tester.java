package com.acts.doublycircular;

import java.util.Scanner;

public class Tester {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CircularDoublyIntf cdllist = new CircularDoublyList();

		int choice = 0;
		do {
			System.out.println("1.Insert at begining");
			System.out.println("2.Insert at last");
			System.out.println("3.Sorted Insertion");// pending
			System.out.println("4.Delete from begining");
			System.out.println("5.Delete from last");
			System.out.println("6.Search element");
			System.out.println("7.exit");

			choice = scan.nextInt();
			switch (choice) {
			case 1:

				cdllist.insertion_beginning(10);
				cdllist.insertion_beginning(20);
				cdllist.insertion_beginning(25);
				cdllist.insertion_beginning(30);
				cdllist.insertion_beginning(35);
				System.out.println("displaying insert at begining Forward");
				cdllist.displayForward();
				System.out.println("displaying insert at begining Backward");
				cdllist.displayBackward();
				System.out.println();

				break;
			case 2:

				cdllist.insertion_last(10);
				cdllist.insertion_last(12);
				cdllist.insertion_last(65);
				cdllist.insertion_last(06);
				cdllist.insertion_last(-1);
				System.out.println("displaying insert at last Forward");
				cdllist.displayForward();
				System.out.println("displaying insert at last Backward");
				cdllist.displayBackward();

				System.out.println();
				break;
			case 3:
				cdllist.Insert(-1);
				cdllist.Insert(0);
				cdllist.Insert(12);
				cdllist.Insert(-5);
				cdllist.Insert(-26);
				cdllist.Insert(25);
				System.out.println("displaying insert at last Forward");
				cdllist.displayForward();
				System.out.println("displaying insert at last Backward");
				cdllist.displayBackward();
				break;
			case 4:
				cdllist.deletion_beginning();
				cdllist.displayForward();
				cdllist.displayBackward();
				break;
			case 5:
				cdllist.deletion_last();
				cdllist.displayForward();
				cdllist.displayBackward();
				break;
				
				
			case 6: 
				System.out.println("Enter the element");
				int num = scan.nextInt();
				System.out.println(cdllist.search(num));
				break;
			case 7:
				System.exit(0);
				break;

			default:
				break;
			}

		} while (choice != 0);
	}

}
