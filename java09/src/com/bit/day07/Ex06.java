package com.bit.day07;

class Car2{
	// �Ӽ�
	String company="����";
	int num=1234;
	String model="�ҳ�Ÿ";
	String color="������";
	int speed=0;
	int max=250;
	int ����=60;

	// ���

	public void speedUp(){
		speed+=����;
		if(speed>250){speed=max;}
	}
	public void speedDown(){
		speed-=����;
		if(speed<0){speed=0;}
	}
	public void myPrint(){
		System.out.println("������ȣ"+num+company
			+" "+color+" "+model+" "+speed+"km�Դϴ�");
	}

}


public class Ex06{

  public static void main(String[] args){
	Car2 me=new Car2();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();
	me.speedUp();
	me.myPrint();

	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();
	me.speedDown();
	me.myPrint();

  }

}















