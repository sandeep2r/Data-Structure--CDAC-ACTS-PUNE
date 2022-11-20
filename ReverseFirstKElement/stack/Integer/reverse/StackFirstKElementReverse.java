package com.acts.stack.Integer.reverse;

import java.util.Scanner;
import java.util.Stack;

public class StackFirstKElementReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		System.out.println("Stack :"+stack);
		int n = stack.size();
		System.out.println(n);
		Stack<Integer> stack1 = new Stack<Integer>();
		for(int i= 0;i<n-k;i++) {
			 
			stack1.push(stack.peek());
			stack.pop();
		}
		System.out.println("Stack :"+stack);
		System.out.println("Stack 1 : "+stack1);
		
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack.isEmpty()) {
			stack2.push(stack.peek());
			stack.pop();
		}
		System.out.println("Stack 2: "+stack2);
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.peek());
			stack1.pop();
		}
		System.out.println("Stack 2:"+stack2);
		

		scan.close();
	}
	
}
