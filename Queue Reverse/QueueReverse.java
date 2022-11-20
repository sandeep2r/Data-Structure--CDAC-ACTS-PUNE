package com.acts.queue.reverse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(null);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		System.out.println(queue);

		Stack<Integer> stack = new Stack<Integer>();

		while (!queue.isEmpty()) {
			stack.push(queue.peek());
			queue.remove();
		}

		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();

		}
		System.out.println(queue);
//		while(!queue.isEmpty()) {
//		System.out.print(queue.peek()+", ");
//		queue.remove();
//		}

	}

}
