package com.bit.am;

public class Ex08 {

	public static void main(String[] args){
		System.out.println("���� ����");
		
		try{
		func01(1);
		func01(0);
		func01(-1);
		}catch(ArithmeticException e){
			System.out.println("�ذ�");
		}
		System.out.println("���� ����");
	}
	
	public static void func01(int a) throws ArithmeticException{
		System.out.println("�޼��� ����");
		ArithmeticException excep=new ArithmeticException();
		throw excep;
//		System.out.println("�޼��� ����");
	
	}

}












