package com.bit.day07;

class Car{
	int speed=0;
	String model="Ƽ��";
	String color="������";

	public void speedUp(int a){
		System.out.println(color+" "+model+"�� "+a+"km �����մϴ�");
		int su=200;
		if(!(a+speed>200)){
			su=a+speed;
		}
		//return su;
		speed=su;
	}
	
	public void speedDown(int b){
		System.out.println(color+" "+model+"�� "+b+"km �����մϴ�");
		int su=0;
		if(speed-b>=0){		//if(!(speed-b<0)){
			su=speed-b;
		}	
		speed=su;
		//return su;
	}
}// class end


public class Ex05{

  public static void main(String[] args){
	// �޸��� ���߰� 
	// �ִ�ӵ� 200km
	
	Car myCar = new Car();
	java.util.Scanner sc=null;
	sc=new java.util.Scanner(System.in);
	int input=0;
	int input2=0;
	while(true){
		System.out.print("1.���� 2.���� 0.����>");
		input=sc.nextInt();
		if(input==0){break;}
		System.out.print("?km :");
		if(input==1||input==2){input2=sc.nextInt();}
		if(input==1){
		  myCar.speedUp(input2);
		}else if(input==2){
		  myCar.speedDown(input2);
		}
		System.out.println("����ӵ� :"+myCar.speed+"km");
	}
  }

  

}













