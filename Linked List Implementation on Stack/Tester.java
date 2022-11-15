package com.acts.LinkedStack;

import java.util.Scanner;

public class Tester {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Stack stack = new Stack();
		int choice=0;
		do {
			System.out.println("1.Push element into the stack");
			System.out.println("2.Pop element from the stack");
			System.out.println("3.Display stack");
			System.out.println("2.Exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				stack.push(10);
				stack.push(20);
				stack.push(30);
				stack.push(40);
				stack.push(50);
				System.out.println("Elements succesfully inserted into the stack");
				break;
			case 2:
				stack.pop();
				System.out.println("Elements succesfully popped out from stack");
				break;
			case 3:
				stack.display();
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
