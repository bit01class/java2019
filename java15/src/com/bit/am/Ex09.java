package com.bit.am;

class MyException extends Exception{
	public MyException() {
		super("���̰� �����̱� ������...");
	}
	public void myFunc(){
		System.out.println("���� �������...");
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
	// ���̸� �����ϴ�...
	public static int func01(int age) throws MyException{
		if(age<0){
			MyException exc=new MyException();
			throw exc;
		}
		return age;
	}

}




















