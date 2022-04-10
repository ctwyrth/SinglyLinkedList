package com.ctwyrth.singlylinkedlist;

public class SinglyLinkedList {
    // VARIABLES
	public Node head;
    
	
	// CONSTRUCTOR
    public SinglyLinkedList() {
        this.head = null;
    }
    
    
    //GETTERS & SETTERS
    public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}    
    
    
    // METHODS
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
    	if (head != null) {
    		Node runner = head;
    		Node previous = head;
            while(runner.next != null) {
            	previous = runner;
                runner = runner.next;
            }
            previous.next = null;
    	}
    }
    
    public void printValues() {
    	Node runner = head;
        while(runner.next != null) {
        	System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner.value);
    }
    
    public boolean findInt(int i) {
    	Node runner = head;
        while(runner.next != null) {
        	if (runner.value == i) {
        		return true;
        	}
            runner = runner.next;
        }
        return false;
    }
    
    public void removeAt(int i) {
    	Node runner = head;
    	Node previous = head;
    	int count = 1;
        while(runner.next != null) {
        	if (count == i) {
        		previous.next = runner.next;
        		runner.next = null;
        		break;
        	}
        	previous = runner;
            runner = runner.next;
            count++;
        }
    }
}

