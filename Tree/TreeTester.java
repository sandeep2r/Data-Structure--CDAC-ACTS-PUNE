package com.acts.tester;

import java.util.Scanner;

import com.acts.tree.Tree;

public class TreeTester {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Tree tree = new Tree();
		int choice = 0;
		do {
			System.out.println("1.Build Tree");
			System.out.println("Deapth first order ");
			System.out.println("2.print preOrder traversal of tree");
			System.out.println("3.print Inorder traversal of tree");
			System.out.println("4.print PostOrder traversal of tree");
			System.out.println("Breadth first order");
			System.out.println("5.print level order traversal of tree");
			System.out.println("6.Build Binary Search Tree(Inorder Printing)");
			System.out.println("7.Find frequency of the element");
			System.out.println("8.Search element in the tree");
			System.out.println("9.replace element in the tree");
			System.out.println("10.preOrder iterative");//pending
			System.out.println("11.inOrder iterative");//pending
			System.out.println("12.postOrder iterative");//pending
			System.out.println("13.levelOrder iterative");//pending
			System.out.println("14.Exit");
			System.out.println("15.Height of binary tree");//pending
			System.out.println("16.Print tree level wise");//pending
			System.out.println("17.mirror image of binary search tree");//pending
			System.out.println();
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				tree.buildTree();
				break;

			case 2:
				System.out.println("Printing preOrder traversal of tree");
				tree.preOrder();
				System.out.println();
				System.out.println("Counter :" + tree.count);
				break;

			case 3:
				System.out.println("Printing InOrder traversal of tree");
				tree.InOrder();
				System.out.println();
				System.out.println("Counter :" + tree.count);
				break;

			case 4:
				System.out.println("Printing PostOrder traversal of tree");
				tree.PostOrder();
				System.out.println();
				System.out.println("Counter :" + tree.count);
				System.out.println("Counter :" + tree.leaves);
				break;
			case 5:
				tree.breadthFirstTraversal();
				System.out.println("Counter :" + tree.count);
				break;

			case 6:
				for (int i = 0; i < 10; i++) {
					tree.insert(scan.nextInt());
				}
				tree.InOrder();
				System.out.println();
				break;
			case 7:
				System.out.println("Enter the element");

				tree.frequency(scan.nextInt(), tree.root);
				System.out.println(tree.freq);
				System.out.println();
				break;

			case 8:
				System.out.println(tree.search(1, tree.root));
				System.out.println(tree.search(25, tree.root));
				System.out.println(tree.search(15, tree.root));
				System.out.println(tree.search(10, tree.root));
				System.out.println(tree.search(27, tree.root));
				System.out.println(tree.search(31, tree.root));
				System.out.println(tree.search(12, tree.root));
				System.out.println(tree.search(5, tree.root));
				break;
			case 9:
				System.out.println("Enter the value you want to change");
				int oldvalue = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the new value");
				int newValue = scan.nextInt();
				scan.nextLine();
				tree.replaceAll(newValue, oldvalue, tree.root);
				break;
			default:
				break;
			}
		} while (choice != 0);

		tree.frequency(2, tree.root);
		System.out.println(tree.freq);

		 tree.replaceAll(0, 11, tree.root);

	}

}
