package com.bit.day08;

public class Ex03{
	 int su;
/*
	����Ʈ������ ��������
	������ �������� ���� ��, �ڵ����� ����
*/
  public Ex03(){
	su=1234;
	System.out.println("su="+su);
  }
  
  public Ex03(int a){
	su=a;
	System.out.println("su="+su);
  }


  public static void main(String[] args){
	String msg1="";
	String msg2=new String();
	System.out.println(msg2);

	Ex03 me=new Ex03(5678);
  }

  public void func01(){
	System.out.println("��ɼ���");
	return;
  }
}







