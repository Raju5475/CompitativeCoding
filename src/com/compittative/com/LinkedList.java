package com.compittative.com;

public class LinkedList {

	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}   
		
	}
		Node head;
		
		//Insert the elements into the  node
		
		public void insert(int data) {
			 Node newNode = new Node(data);
			if(head==null) {
				head=newNode;
			}else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			
		}
		public void display() {
			Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
		}
		
		public void reverse() {
			Node prev=null;
			Node current=head;
			Node next=null;
			
			
			while(current!=null) {
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			head=prev;
		}
		
		public static void main(String[] args) {
			LinkedList list=new LinkedList();
			list.insert(1);
			list.insert(2);
			list.insert(3);
			list.insert(4);
			list.insert(5);
			
			list.display();
			
			list.reverse();
			list.display();
			
		}
	}

