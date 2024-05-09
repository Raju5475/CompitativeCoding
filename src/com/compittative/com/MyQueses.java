package com.compittative.com;

import java.util.Stack;

public class MyQueses {
	Stack<Integer> inStacks;
	Stack<Integer> queue;	
public MyQueses() {
	inStacks=new Stack<Integer>();
	queue=new Stack<Integer>();
	
}
public void push(int x) {
	inStacks.push(x);
}
public int pop() {
	if(queue.empty()) {
		while(!inStacks.empty()) {
			queue.push(inStacks.pop());
		}
	}
	//
	return queue.pop();
}
public int peek() {
	if(queue.isEmpty()) {
		while(!inStacks.isEmpty()) {
			queue.push(inStacks.pop());
		}
	}
	return queue.peek();
}
//Check for the empty stacks
public boolean empty() {
	return inStacks.isEmpty() && queue.isEmpty();
} 
}
