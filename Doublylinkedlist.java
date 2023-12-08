package javalab;
import java.util.Scanner;
import java.util.LinkedList;
 class DoublyLinkedListDemo <T>{
	private LinkedList <T> list = new LinkedList<>();
	public void insertLast(T element) {
		list.addLast(element);
	}
	public void insertFirst( T element) {
		list.addFirst(element);
	}
	public void insertanyposition(int index,T element){
		list.add(index,element);
		}
	public void removeanyposition(int index) {
		list.remove(index);
		}

	public void display() {
		for(T element:list) {
			System.out.print(element+" ");
		}

		System.out.println( );

	}

}
public class Doublylinkedlist{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedListDemo<Integer>doublyLInkedList = new DoublyLinkedListDemo <>();
		int choice=0;
	    while(choice!=6) {
			System.out.println("1.Insertion At Front\n"
					+ "2.Insertion At End\n"
					+"3.Insertion At any position\n"
					+"4.Deletion at any Position\n"
					+"5.Display\n"
					+"6.Exit\n"
					+"Enter your choice:"
					);

				choice=sc.nextInt();
	int num,pos;
     switch(choice) {
		case 1 :
			System.out.println("Enter the element:");
			num = sc.nextInt();
			doublyLInkedList.insertFirst(num);
			break;

		case 2 :
			System.out.println("Enter the element:");
			 num = sc.nextInt();
			doublyLInkedList.insertLast(num);
			break;

		case 3 :
			System.out.println("Enter the element:");
		    num = sc.nextInt();
			System.out.println("Enter the position:");
			 pos = sc.nextInt();
			doublyLInkedList.insertanyposition(pos,num);
			break;
		case 4:
			System.out.println("Enter the position:");
			 pos = sc.nextInt();
			doublyLInkedList.removeanyposition(pos);
			break;

		case 5:
			System.out.println("The elements are :");
			doublyLInkedList.display();
			break;
		case 6:
			System.out.println("Exited");

	}

}

}

}
