package com.laioffer.classone;

public class LinkedList {
	//Class variables for the Linked List
		private static Node head;
		private static int numNodes;
		
		public static void main(String [] args)
		{
			System.out.println("/=/=/=/= TESTING /=/=/=/=");
			LinkedList ll = new LinkedList(10);
			ll.addAtHead(11);
			ll.printList();
			ll.change(ll.head,5);
			ll.printList();
			
		}
		
		public LinkedList(int value)
		{
			head = new Node(value);
		}
		
		public void addAtHead(int value)
		{
			Node temp = head;
			head = new Node(value);
			head.next = temp;
			numNodes++;
		}
		
		public void addAtTail(int value)
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = new Node(value);
			numNodes++;
		}
		
		public void addAtIndex(int index, int value)
		{
			Node temp = head;
			Node holder;
			for(int i=0; i < index-1 && temp.next != null; i++)
			{
				temp = temp.next;
			}
			holder = temp.next;
			temp.next = new Node(value);
			temp.next.next = holder;
			numNodes++;
		}
		
		public void deleteAtIndex(int index)
		{
			Node temp = head;
			for(int i=0; i< index - 1 && temp.next != null; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			numNodes--;
		}
		
		public static int find(Node n)
		{
			Node t = head;
			int index = 0;
			while(t != n)
			{
				index++;
				t = t.next;
			}
			return index;
		}
		
		public static Node find(int index)
		{
			Node temp=head;
			for(int i=0; i<index; i++)
			{
				temp = temp.next;
			}
			return temp;
		}
			
		public static void printList()
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.println(temp.value);
				temp = temp.next;
			}
		}
		
		public static int getSize()
		{
			return numNodes;
		}
		
		public void change(Node head, int value) {
			Node next = new Node(value);
			head.next = next;
		}
		
		class Node
		{
			//Declare class variables
			private Node next;
			private int value;
			
			public Node(int dat)
			{
				this.value = dat;
			}
			
			public int getValue()
			{
				return value;
			}
		}
}
