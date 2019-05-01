package com.bit.am;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int input=0;
		System.out.println("create new Scanner");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			System.out.print("반드시 숫자를 입력해주세요");
			try{
			input=sc.nextInt();
			}catch(java.util.InputMismatchException e){
				System.out.println("create new Scanner");
				sc=new Scanner(System.in);
			}
			System.out.println("input="+input);
		}
		

	}

}












