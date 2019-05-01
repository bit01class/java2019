package com.bit.am;

import java.util.Stack;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		
		stack.push(1111);
		stack.push(2222);
		stack.push(3333);
		stack.push(4444);
		
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
		
//		System.out.println(stack.pop());
		
//		System.out.println(stack.empty());
//		stack.pop();
//		System.out.println(stack.empty());
//		stack.pop();
//		System.out.println(stack.empty());
//		stack.pop();
//		System.out.println(stack.empty());
//		stack.pop();
//		System.out.println(stack.empty());
	}

}
