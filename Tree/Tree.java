package com.acts.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.acts.node.Node;

public class Tree {
	public Node root = null;
	public int count;
	public int freq;
	public int leaves;

	public void preOrder() {
		count = 0;
		preOrder(root);
	}

	public void preOrder(Node root) {
		if (root == null) {
			System.out.println("Tree Is Empty");
			return;
		}

		System.out.print(root.data + "\t");
		++count;
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}

	public void InOrder() {
		count = 0;
		InOrder(root);
	}

	public void InOrder(Node root) {
		if (root == null) {
			System.out.println("Tree Is Empty");
			return;
		}
		++count;
		if (root.left != null) {
			InOrder(root.left);
		}
		System.out.print(root.data + "\t");
		if (root.right != null) {
			InOrder(root.right);
		}
	}

	public void PostOrder() {
		count = 0;
		PostOrder(root);
	}

	public void PostOrder(Node root) {
		if (root == null) {
			System.out.println("Tree Is Empty");
			return;
		}
		++count;
		if (root.left != null) {
			PostOrder(root.left);
		}
		if (root.right != null) {
			PostOrder(root.right);
		}
		System.out.print(root.data + "\t");
		if (root.left == null || root.right == null) {
			++leaves;
		}
	}

//----------------level traversal
	public void breadthFirstTraversal() {
		Queue<Node> queue = new LinkedList<Node>();

		if (root == null) {
			System.out.println("Empty Tree");
			return;

		}
		queue.add(root);
		while (!queue.isEmpty()) {
			if (queue.peek().left != null) {
				queue.add(queue.peek().left);
			}
			System.out.print(queue.peek().data + " ");
			++count;
			if (queue.peek().right != null) {
				queue.add(queue.peek().right);
			}
			queue.poll();

		}
	}

//	private void Element(Node current, int element) {
//		
//		if (current == null) {
//			System.out.println("Tree Is Empty");
//			return;
//		}
//		if(current.data==element) {
//		System.out.print(current.data + "\t");
//		return;
//		}
//		if (current.left != null) {
//			preOrder(current.left);
//		}
//		if (current.right != null) {
//			preOrder(current.right);
//		}
//		
//	}

//	public boolean search(int element) {
//		return search(element, root);
//	}

	public boolean search(int element, Node current) {
		if (current.data == element) {
			return true;
		}
		if (current.left == null) {
			if (current.right == null) {
				return false;
			} else {
				return search(element, current.right);
			}

		} else {
			if (current.right == null)
				return search(element, current.left);
			else
				return search(element, current.left) || search(element, current.right);
		}

	}

	public void frequency(int element, Node root) {

		if (root.data == element) {
			++freq;
		}
		if (root.left == null) {
			if (root.right == null) {

			} else {
				frequency(element, root.right);
			}

		} else {
			if (root.right == null)
				frequency(element, root.left);
			else {
				frequency(element, root.left);
				frequency(element, root.right);
			}
		}

	}

	public void replaceAll(int newValue, int oldValue, Node root) {

		if (root.data == oldValue) {
			root.data = newValue;
		}
		if (root.left == null) {
			if (root.right == null) {

			} else {
				replaceAll(newValue, oldValue, root.right);
			}

		} else {
			if (root.right == null)
				replaceAll(newValue, oldValue, root.left);
			else {
				replaceAll(newValue, oldValue, root.left);
				replaceAll(newValue, oldValue, root.right);
			}
		}

	}
//Binary search tree=======================================
	public void insert(int element) {
		Node newNode = new Node(element);
		if (root == null) {
			root = newNode;
			return;
		}
		insert(newNode, root);
	}
	

	public void insert(Node newNode, Node root) {
		if (root.data < newNode.data) {
			if (root.right == null)
				root.right = newNode;
			else
				insert(newNode, root.right);
		} else {
			if (root.left == null)
				root.left = newNode;
			else
				insert(newNode, root.left);
		}

	}
//======================binary search tree end==============
	public void buildTree() {
		root = new Node(5);
		root.left = new Node(10);
		root.left.left = new Node(25);
		root.left.right = new Node(15);
		root.right = new Node(12);
		root.right.left = new Node(25);
		root.right.right = new Node(31);

	}

}
