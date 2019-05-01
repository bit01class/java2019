package com.bit.am;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int input1=0;
		String input2=null;
		
		System.out.print("숫자를 입력하세요>");
		input2=sc.nextLine();
		try{
			input1=Integer.parseInt(input2);
		}catch(NumberFormatException e){
			
		}	
		System.out.print("문자를 입력하세요>");
		input2=sc.nextLine();
		
		System.out.print("숫자를 입력하세요>");
		input2=sc.nextLine();
		try{
			input1=Integer.parseInt(input2);
		}catch(NumberFormatException e){
			
		}	
		
		System.out.print("문자를 입력하세요>");
		input2=sc.nextLine();
		

	}

}









