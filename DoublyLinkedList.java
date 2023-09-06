package EY_2508;

public class DoublyLinkedList {
	
	class Node {
		int data;
		Node previous;
		Node next;
	
		public Node(int data) {
			this.data = data;
		}
	}
		Node head,tail = null;
		public void addItem(int data) {
			Node newNode = new Node(data);
			
			if(head ==null) {       //that means list is empty
				head=tail = newNode;
				head.previous = null;
				tail.next = null;
			} else {     // list already has got some items
				tail.next = newNode;
				newNode.previous = tail;
				tail = newNode;
				tail.next = null;
			}
		}
		
		//will print all nodes at the list
		public void display() {
			Node current = head; //current element will point to the head
			if(head ==null) {
				System.out.println("List is empty");
				return; 
			} 
			System.out.println("Nodes are doubly linked list: ");
			while(current != null) {
				System.out.println(current.data + " ");
				current = current.next;
			}
		}
	

	public static void main(String[] args) {
		
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.addItem(10);obj.addItem(15);obj.addItem(10);obj.addItem(10);obj.addItem(10);
		obj.display();
	}

}
