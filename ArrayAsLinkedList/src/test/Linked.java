package test;

public class Linked {
	Node head;

	public static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
		}
	}

	public static Linked insert(Linked list, int data) {

		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		return list;
	}
	
	public static void printList(Linked list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
    
      
        while (currNode != null) {
          
            System.out.print(currNode.data + " ");
    
           
            currNode = currNode.next;
        }
    }
	public static void main(String[] args)
    {
        Linked list = new Linked(); 
        list = insert(list, 1);
        list= insert(list,  9);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);
    }

}
