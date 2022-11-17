package linkedListOfVehical;

import java.util.Scanner;

public class Tester {
	static Scanner scan = new Scanner(System.in);
	static int choice = 0;
	public static void main(String[] args) {
		
		DoublyLinkedList<Vehical> dlist = new DoublyLinkedList<Vehical>();
		
		do {
			System.out.println("1.Add at front");
			System.out.println("2.Add at Last");
			System.out.println("3.Delete from Front");
			System.out.println("4.Delete from Last");
			System.out.println("5.Search Vehical by vehical no");
			System.out.println("6.Print all vehical details");
			System.out.println("7.Print vehical list in reverse order");
			
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				dlist.addFirst(new Vehical(1001, "company1", "model1", "type1", 100000, "color1"));
				dlist.addFirst(new Vehical(1004, "company4", "model4", "type4", 400000, "color4"));
				dlist.addFirst(new Vehical(1003, "company3", "model3", "type3", 300000, "color3"));
				dlist.addFirst(new Vehical(1002, "company2", "model2", "type2", 200000, "color2"));
				dlist.addFirst(new Vehical(1005, "company5", "model5", "type5", 500000, "color5"));

				dlist.print();
				break;
			case 2:
				dlist.addLast(new Vehical(1001, "company1", "model1", "type1", 100000, "color1"));
				dlist.addLast(new Vehical(1002, "company2", "model2", "type2", 200000, "color2"));
				dlist.addLast(new Vehical(1003, "company3", "model3", "type3", 300000, "color3"));
				dlist.addLast(new Vehical(1004, "company4", "model4", "type4", 400000, "color4"));
				dlist.addLast(new Vehical(1005, "company5", "model5", "type5", 500000, "color5"));

				dlist.print();
				break;
			case 3:
				dlist.deleteFirst();
				dlist.print();
				break;
			case 4:
				dlist.deleteLast();
				dlist.print();
				break;
			case 5:
				System.out.println("Enter the vehical no");
				int vehicalNo = scan.nextInt();
				Node<Vehical> current = dlist.head;
				while(current!=null) {
					if(current.data.getVehicalNo()==vehicalNo) {
						System.out.println(current.data+" ");
					}
					current = current.next;
				}
				break;
			case 6:
				dlist.print();
				break;
			case 7:
				dlist.printReverse();
				
				break;
			
			default:
				break;
			}
		} while (choice!=0);
		
		
		
	}

}
