package com.bit.day08;

public class Ex10{

  public static void main(String[] args){

	/*
		�� 
		�� �� 
		�� �� �� 
		�� �� �� ��
	*/
	//String[] box1={"��","�� ��","�� �� ��","�� �� �� ��"};
	String[] box1=new String[4];
	for(int i=0; i<box1.length; i++){
		//box1[i]="�� �� �� ��";
		box1[i]="";
		for(int j=0; j<=i; j++){
			box1[i]+="�� ";
		}
	} 
	
	for(int i=0; i<box1.length; i++){
		System.out.println(box1[i]);
	}
  }

}














