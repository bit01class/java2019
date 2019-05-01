package com.bit.am;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		func01();
		System.out.println("메인 종료");
	}
	
	public static void func01(){
		System.out.println("start func01");
		try{	// ~1.6
			//int su=5/0;
		}finally{
			System.out.println("반드시 실행하고 말꺼야");			
		}
		System.out.println("end func01");
		
	}

}













