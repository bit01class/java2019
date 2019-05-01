package com.bit.day13;

public class Ex04 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		for(int i=0; i<6; i++){
			sb.append('a');
			System.out.print(sb+",length:"+sb.length());
			System.out.println(",capacity:"+sb.capacity());
		}
		sb.trimToSize();
		System.out.println("capacity:"+sb.capacity());

	}

}














