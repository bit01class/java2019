/*
non-static method (�ν��Ͻ� �޼���, ��� �޼���)
1. static method���� non-static method call ��ü���� �� 
	��������.�޼����();(���������� �̿��ؼ� ����)
2. non-static method���� non-static method call
	�޼����();
3. static method���� static method call
	�޼����();
4. non-static method���� static method call
	�޼����();
*/


package com.bit.day06;


public class Ex03{

  public static void main(String[] args){
	Ex03 me;		//������ ����
	me = new Ex03();	//�ʱ�ȭ(��ü ����)
	me = new Ex03();
	me.func01(); // ������ ��ü�� func01�޼��� ����
	//me.func02();
	//func03();
  }

  public void func01(){
	System.out.println("func01�� ����Դϴ�");
	//func02();
	func03();
	return;
  }

  public void func02(){
	System.out.println("func02�� ����Դϴ�");
  }

  public static void func03(){
	//Ex03 you = new Ex03();
	//you.func02();
	System.out.println("static method �Դϴ�");
  }

}









