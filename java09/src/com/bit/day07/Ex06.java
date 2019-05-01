package com.bit.day07;

class Car2{
	// 속성
	String company="현대";
	int num=1234;
	String model="소나타";
	String color="검정색";
	int speed=0;
	int max=250;
	int 가감=60;

	// 기능

	public void speedUp(){
		speed+=가감;
		if(speed>250){speed=max;}
	}
	public void speedDown(){
		speed-=가감;
		if(speed<0){speed=0;}
	}
	public void myPrint(){
		System.out.println("차량번호"+num+company
			+" "+color+" "+model+" "+speed+"km입니다");
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















