/*
�ڹ��� �⺻ ������ class
class�� �������
	1. �޼���(static, non-static)
	2. ����
*/
package com.bit.day06;

class Ex05{
  int num1=100;	// ����ʵ�, �ν��Ͻ� ����...
  static int num2=200;	// Ŭ��������, static ����...

  public static void main(String[] args){

	num2++;
	System.out.println("num2="+num2);
	num2++;
	System.out.println("num2="+num2);
	num2++;
	System.out.println("num2="+num2);
	System.out.println("-----------------------------------");
	Ex05 me, you;
	me=new Ex05();
	you=me;
	me.num1++;
	System.out.println("num1="+me.num1);
	me=new Ex05();
	//me.num1++;
	System.out.println("num1="+me.num1);
	me=new Ex05();
	//me.num1++;
	System.out.println("num1="+me.num1);
	System.out.println("you num1="+you.num1);

  }

  public void func01(){
	//int su;
	//su=4321;
	//num1++;
	System.out.println("func01 num2="+num2);
	
  }


}












