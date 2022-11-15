package com.acts.circularQueue;

import java.util.Scanner;

public class Tester {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		
		System.out.println(cq.toString());
		int choice =0;
		
		do {
			System.out.println("1.Add the given element at the Rear of the queue");
			System.out.println("2.Remove element from front of the queue");
			choice = scan.nextInt();
			switch (choice) {
			case 1:cq.AddQ(10);
		cq.AddQ(20);
		cq.AddQ(30);
		cq.AddQ(40);
		cq.AddQ(50);
		System.out.println(cq.toString());

		System.out.println(cq.isFull());
				break;
			case 2:
				cq.DeleteQ();
				System.out.println(cq.toString());

				break;
			

			default:
				break;
			}
			
		} while (choice != 0);
	}

}
