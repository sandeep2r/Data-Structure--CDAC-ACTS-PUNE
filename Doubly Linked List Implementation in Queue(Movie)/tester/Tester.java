package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

import queue.doublyLinkedList.movie.Movie;
import queue.doublyLinkedList.movie.Node;
import queue.doublyLinkedList.movie.Queue;

public class Tester {
	static Scanner scan = new Scanner(System.in);
	static int choice = 0;

	public static void main(String[] args) {
		Queue<Movie> queue = new Queue<Movie>();

		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.isEmpty");
			System.out.println("5.Find all movies published after given  year ");
			System.out.println("6.Reverse the queue content (using java.util.Stack)");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				queue.push(new Movie(1001, "Movie1", "Actor1", "Director1", LocalDate.of(2011, 1, 11)));
				queue.push(new Movie(1002, "Movie2", "Actor2", "Director2", LocalDate.of(2012, 2, 12)));
				queue.push(new Movie(1003, "Movie3", "Actor3", "Director3", LocalDate.of(2013, 3, 13)));
				queue.push(new Movie(1004, "Movie4", "Actor4", "Director4", LocalDate.of(2014, 4, 14)));
				queue.push(new Movie(1005, "Movie5", "Actor5", "Director5", LocalDate.of(2015, 5, 15)));
				queue.display();
				break;
			case 2:
				queue.pop();
				queue.display();
				break;
			case 3:
				queue.peek();
				break;
			case 4:
				System.out.println(queue.isEmpty());
				break;
			case 5:
				Node<Movie> current = queue.list.head;
				while(current!=null) {
					if(current.data.getRelease_date().getYear()>2012) {
						System.out.println(current.data+" ");
					}
					current = current.next;
				}
				break;
			case 6:
				Stack<Movie> stack = new Stack<Movie>();
				while(!queue.isEmpty()) {
					stack.push(queue.pop());
				}
				while(!stack.isEmpty()) {
					queue.push(stack.pop());
				}
				queue.display();
				break;

			default:
				break;
			}

		} while (choice != 0);

	}

}
