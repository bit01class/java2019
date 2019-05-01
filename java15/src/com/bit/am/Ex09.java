package com.bit.am;

class MyException extends Exception{
	public MyException() {
		super("나이가 음수이기 때문에...");
	}
	public void myFunc(){
		System.out.println("아직 엄마배속...");
	}
}

public class Ex09 {

	public static void main(String[] args){
		try{
			int age=func01(-20);
			System.out.println("age="+age);
		}catch(MyException ex){
//			System.out.println(ex.getMessage());
//			System.out.println(ex.toString());
//			ex.printStackTrace();
			ex.myFunc();
			///~~~~~~
		}
		
	}
	// 나이를 리턴하는...
	public static int func01(int age) throws MyException{
		if(age<0){
			MyException exc=new MyException();
			throw exc;
		}
		return age;
	}

}




















