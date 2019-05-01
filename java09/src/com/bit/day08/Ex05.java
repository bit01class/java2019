package com.bit.day08;

public class Ex05{
  int su=1234;

  public Ex05(){
	//su=100;
	//System.out.println("param蒸澗 持失切");	
  }

  public Ex05(int su){
	//this.su=su;
	//System.out.println("int param 持失切");	
  }

  public static void main(String[] args){

	Ex05 me = new Ex05();	
	me.func01();

	System.out.println(1+((((3*5)*5)*3)*2)*1);
  }

  public void func01(){
	this.func02();
	int su=4321;
	System.out.println("su="+this.su);
  }

  public void func02(){
	
  }

  public void func03(){
  }

}