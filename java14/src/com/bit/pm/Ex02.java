package com.bit.pm;

abstract class Ex22{
	// �߻�Ŭ������ �߻� �޼��带 0���̻� ���� Ŭ����
	int a=1;
	
	public Ex22() {
	}
	
	public void func01(){
		System.out.println("func01()...");
	}
	
	public abstract void func02(); // �߻�޼���- �޼����� �����ְ� ��������
}


public class Ex02 extends Ex22 {

	public void func02(){
		System.out.println("�ٲ� ���....");
	}
	
	public static void main(String[] args) {
//		Ex22 you=new Ex22();
//		you.func01();
		Ex02 me=new Ex02();
//		me.func02();
	}

}
