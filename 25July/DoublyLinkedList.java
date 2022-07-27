package DataStructure;

import java.io.*;

public class DoublyLinkedList {
	Node head; // head of list (first node address)

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			prev = null;
			data = d;
			next = null;
		}
	}

	public static DoublyLinkedList insert(DoublyLinkedList list, int data) {
		// Create a new node with given data
		Node new_node = new Node(data);
		// new_node.next = null;
		// If the Linked List is empty, then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			// Insert the new_node at last node
			last.next = new_node;
			new_node.prev = last;
		}
		return list;

		/*
		 * for(Node last=list.head;last.next!=null;last=last.next);
		 * last.next=new_node;
		 */

	}

	public static void printList(DoublyLinkedList list) {
		Node last = list.head;
		System.out.print("LinkedList: ");
		// Traverse through the LinkedList
		while (last != null) {
			// Print the data at current node
			System.out.print(last.data + " ");
			// Go to next node
			last = last.next;
		}

		/*
		 * for(Node c=list.head;c!=null;c=c.next){ System.out.println(c.data); }
		 */
		System.out.println();
	}

	public static void printListReverse(DoublyLinkedList list) {
		Node last = list.head;
		System.out.print("Reverse LinkedList: ");
		// Traverse through the LinkedList
		while (last.next != null) {

			// Go to next node
			last = last.next;
		}

		while (last != null) {
			// Print the data at current node
			System.out.print(last.data + " ");
			// Go to next node
			last = last.prev;
		}

		
	}

	// Method to delete a node in the LinkedList by KEY
	public static DoublyLinkedList deleteByKey(DoublyLinkedList list, int key) {
		// Store head node
		Node last = list.head, prev = null;
		
		//there is no element in list
		/*if (last == null) {
			System.out.println(key + " not found");
		}
		else
		{*/
			while(last!=null && key!=last.data){
				last=last.next;
				
			}
			
			if(last!=null){
				if(last.next!=null)
				last.next.prev=last.prev;
				if(last.prev!=null)
				last.prev.next=last.next;
				System.out.println("Key Deleted");
			}
			if(last==null)
				System.out.println("Key not found"+key);
			
		//}
		
		
		return list;
	}

	// method to create a Singly linked list with n nodes
	public static void main(String[] args) {
		/* Start with the empty list. */
		DoublyLinkedList list = new DoublyLinkedList();
		// Insert the values
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		// Print the LinkedList
		printList(list);
		// Delete node with value 1
		deleteByKey(list, 1);
		// Print the LinkedList
		//printList(list);
		// Delete node with value 4
		deleteByKey(list, 8);
		// Print the LinkedList
		printList(list);
		// Delete node with value 10
		deleteByKey(list, 10);
		// Print the LinkedList
		printListReverse(list);
	}
}
