package com.bit.day08;

class Car{

  int speed;
  String model;
  int max;

  public Car(String msg,int a){
	model=msg;
	max=a;
  }

  public void runCar(){
	speed+=30;//
	if(speed>max){speed=max;}
	System.out.println(speed+"km�� "+model+" �޸���");
  }

  public void stopCar(){
	System.out.println("�ڵ��� �����");
  }

}

public class Ex02{

  public static void main(String[] args){
	Car myCar1=new Car("�ҳ�Ÿ",200);
	Car myCar2=new Car("����",150);
	myCar1.speed=0;
	myCar1.model="�ҳ�Ÿ";
	myCar1.max=200;
	//myCar2.model="����";
	//myCar2.max=150;


	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.stopCar();
	for(int i=0; i<10; i++){
		myCar2.runCar();
	}
  }

}














