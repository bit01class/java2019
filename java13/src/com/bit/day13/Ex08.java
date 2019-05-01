package com.bit.day13;

class Student{
	private static int cnt=0;
	final int num;
	int kor;
	int eng;
	int math;
	
	public Student() {
		Student.cnt++;
		this.num=1900+cnt;
	}
}

public class Ex08 {
	static int[] array=null;
	static int[] temp=null;
	static int cnt=0;
	
	public static void func(int su){
		temp=array;
		array=new int[++cnt];
		if(temp!=null){
			for(int i=0; i<temp.length; i++){
				array[i]=temp[i];
			}
		}
		array[array.length-1]=su;		
	}
	
	public static void main(String[] args) {
		// 동적할당
		func(1);
		func(11);
		func(111);
		func(1111);
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		
		
	}

}

















