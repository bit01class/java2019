package com.bit.day12;

class Target1{
	int su1=1000;
	String msg="�ʱⰪ";
	void func01(){
		System.out.println("Target1�� ���");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Target1[] arr=new Target1[3];
		arr[0]=new Target1();
		arr[1]=new Target1();
		arr[2]=new Target1();
		
		arr[1].msg="�ٲ�";
		
		for(int i=0; i<arr.length; i++){
//			arr[i].func01();
			System.out.println(arr[i].su1);
			System.out.println(arr[i].msg);
		}

	}

}










