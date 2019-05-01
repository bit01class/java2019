package com.bit.am;

public class Ex07 {

	public static void main(String[] args) {
		
		for(int i=-4; i<5; i++){
			try{
				System.out.println("문제없음"+i);
					int a=5/i;
			}catch(Exception e){
//				System.out.println(e.getMessage());
//				System.out.println(e.toString());
				e.printStackTrace();
			}
		}

	}

}
