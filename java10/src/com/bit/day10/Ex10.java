package com.bit.day10;

class Ex111{
	
	public Ex111(int a) {
		super();
		System.out.println(a+"�θ�ü ����...");
	}
	
	void func01(){
		System.out.println("�θ�Ŭ������ ���");
	}
}

public class Ex10 extends Ex111 {
	
	public Ex10() {
		//super(1111);
		this(2222);
		System.out.println("�ڽİ�ü ����...");
	}
	
	public Ex10(int a){
		super(a);
		System.out.println("param a="+a+"�� �޴� ������ ȣ��");
	}
	

	public static void main(String[] args) {
		Ex10 me= new Ex10();
		me.func01();
	}
	
	public void func01(){
		super.func01();
		System.out.println("�ڽ�Ŭ������ ���");
	}

}














