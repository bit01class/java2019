package com.bit.day13;

public class Ex05 {

	public static void main(String[] args) {
		String msg="java|web|db|spring";
		String[] parts = msg.split("\\|");
		for(int i=0; i<parts.length; i++){
			System.out.println(parts[i]);
		}
		String result="";
		for(int i=0; i<parts.length; i++){
			if(i!=0){
				result+="|";				
			}
			result+=parts[i];
		}
		System.out.println(result);
	}

}
