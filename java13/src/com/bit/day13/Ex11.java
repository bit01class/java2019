package com.bit.day13;

class Machine{
	
	void on(){
		System.out.println("�Ѵ�");
	}
	
	void off(){
		System.out.println("����");
	}
	
}

class Tv extends Machine{
	void on(){
		System.out.println("ȭ���� ����Ѵ�");
	}
}

class Radio extends Machine{
	void on(){
		System.out.println("���ļ��� ���� �Ҹ��� ����Ѵ�");
	}
}

class Audio extends Machine{
	void on(){
		System.out.println("������ Ʋ���ش�");
	}
}



public class Ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Machine remote=null;
		System.out.print("1.Tv 2.radio 3.Audio>");
		int input=sc.nextInt();
		if(input==1){
			remote=new Tv();
		}else if(input==2){
			remote = new Radio();
		}else if(input==3){
			remote = new Audio();
		}
		remote.on();
		remote.off();

	}

}
















