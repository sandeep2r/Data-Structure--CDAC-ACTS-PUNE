package com.acts.stack.reverse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackReverse {
	public static void main(String[] args) {
		
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
		System.out.println(stack);
		
		Queue<Integer> queue = new LinkedList<Integer>();
		while(!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
		while(!queue.isEmpty()) {
			stack.push(queue.poll());
		}
		System.out.println(stack);
	}
}
