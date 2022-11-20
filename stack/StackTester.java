package com.acts.stack;

import java.util.Scanner;

import com.acts.exception.StackIsEmptyException;
import com.acts.exception.StackIsFullException;

public class StackTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size = scan.nextInt();
		scan.nextLine();
		StackPojo<Integer> stackpojo = new StackPojo<Integer>(size);
		
		
		try {
			for(int i = 0;i<size+1;i++) {
				stackpojo.push(i);
			}
			
			System.out.println(stackpojo.toString()+"\n");
		} catch (StackIsFullException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Enter the no of elements you want to pop out from stack");
		int element = scan.nextInt();
		scan.nextLine();
		try {
			for(int i=0;i<element;i++) {
			stackpojo.pop();
			}
			
			System.out.println(stackpojo.toString()+"\n");
		} catch (StackIsEmptyException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("stack is full : "+stackpojo.isFull()+"\n");
		System.out.println("stack is empty : "+stackpojo.isEmpty()+"\n");
	scan.close();	
	}

}
