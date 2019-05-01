package com.bit.day08;

public class Ex10{

  public static void main(String[] args){

	/*
		бс 
		бс бс 
		бс бс бс 
		бс бс бс бс
	*/
	//String[] box1={"бс","бс бс","бс бс бс","бс бс бс бс"};
	String[] box1=new String[4];
	for(int i=0; i<box1.length; i++){
		//box1[i]="бс бс бс бс";
		box1[i]="";
		for(int j=0; j<=i; j++){
			box1[i]+="бс ";
		}
	} 
	
	for(int i=0; i<box1.length; i++){
		System.out.println(box1[i]);
	}
  }

}














