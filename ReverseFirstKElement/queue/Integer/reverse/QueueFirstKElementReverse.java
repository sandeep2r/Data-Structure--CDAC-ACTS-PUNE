package com.acts.queue.Integer.reverse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueFirstKElementReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		System.out.println(queue);//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<k;i++) {
			
			stack.push(queue.peek());
			queue.remove();
		}
		//System.out.println(stack);//[60, 70, 80, 90, 100]
		
//		System.out.println(stack);//[10, 20, 30, 40, 50]
		while(!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
			
		}
//		
//		System.out.println(queue);//[60, 70, 80, 90, 100, 50, 40, 30, 20, 10]
		for(int i =0;i<queue.size()-k;i++) {
			queue.add(queue.peek());
			queue.remove();
		}
		System.out.println(queue);//[50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
		
		
		
		
		scan.close();
	}

}
