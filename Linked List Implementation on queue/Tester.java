package com.acts.linkedQueue;

import java.util.Scanner;

public class Tester {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		 Queue queue = new Queue();
		 
		 
		 
		
		 int choice =0;
		 do {
			 System.out.println("1.Insert an element in queue");
			 System.out.println("2.Delete an element from queue");
			 System.out.println("3.Display queue");
			 System.out.println("4.Exit");
			 choice = scan.nextInt();
			switch (choice) {
			case 1:
			     queue.insert(10);
				 queue.insert(20);
				 queue.insert(30);
				 queue.insert(40);
				 System.out.println("Element inserted succesfully");
				break;
			case 2:
				queue.delete();
				System.out.println("Element deleted succesfully");
				break;
			case 3:
				 queue.display();
				 System.out.println();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				break;
			}
		} while (choice!=0);
	}

}
