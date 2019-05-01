package com.bit.day11;

public class Ex16 {

	public static void main(String[] args) {
		int[] arr1;
//		arr1=new int[5];
		arr1=new int[]{1,3,5,7,9};
		
		//배열의 얕은 복사
		//int[] arr2=arr1;
		
		// 깊은 복사
		int[] arr2=new int[arr1.length];
		for(int i=0; i<arr2.length;i++){
			arr2[i]=arr1[i];
		}
		
		arr1[2]=100;
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		System.out.println("-----------------------------");
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		
		System.out.println("-----------------------------");
		int su=100;
		su=func1(su);
		System.out.println(su);
		func2(arr2);
		System.out.println(arr2[0]);
	}
	
	
	public static int func1(int a){
		return 2000;
	}
	
	public static void func2(int[] arr){
		arr[0]=2000;
	}

}


















