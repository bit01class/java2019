package com.bit.am;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("���� ����");
		func01();
		System.out.println("���� ����");
	}
	
	public static void func01(){
		System.out.println("start func01");
		try{	// ~1.6
			//int su=5/0;
		}finally{
			System.out.println("�ݵ�� �����ϰ� ������");			
		}
		System.out.println("end func01");
		
	}

}













