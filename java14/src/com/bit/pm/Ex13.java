package com.bit.pm;

public class Ex13 {

	public static void main(String[] args) {
		int[] arr=new int[]{1,2,4,5};
		try{
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		}catch(java.lang.ArrayIndexOutOfBoundsException e){
		}catch(NumberFormatException e){
			System.out.println("에러해결함");
		}
	}

}
