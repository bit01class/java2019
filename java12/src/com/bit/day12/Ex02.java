package com.bit.day12;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 복사
		int[] arr1=new int[]{1,3,5,7,9,11,13,15};
		// 배열의 얕은 복사(shallow copy)
		//int[] arr2=arr1;
		// 깊은 복사
//		int[] arr2=new int[arr1.length];
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		//{5,7,9,11,13}
		int[] arr2=new int[10];
		// arraycopy(원본배열이름,원본시작위치
		//			,타겟이름,타겟시작위치,시작위치로부터 몇개);
		java.lang.System.arraycopy(arr1, 2, arr2, 5, 5);
		
		arr1[1]=100;
		System.out.println(java.util.Arrays.toString(arr2));
		
		
		arr1[1]=30;
		
//		for(int i=0; i<arr2.length; i++){
//			System.out.println(arr2[i]);
//		}

	}

}
