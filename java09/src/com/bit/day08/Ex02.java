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
	System.out.println(speed+"km로 "+model+" 달린다");
  }

  public void stopCar(){
	System.out.println("자동차 멈춘다");
  }

}

public class Ex02{

  public static void main(String[] args){
	Car myCar1=new Car("소나타",200);
	Car myCar2=new Car("레이",150);
	myCar1.speed=0;
	myCar1.model="소나타";
	myCar1.max=200;
	//myCar2.model="레이";
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














