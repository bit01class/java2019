package com.bit.day12;

public class Ex02 {

	public static void main(String[] args) {
		// �迭 ����
		int[] arr1=new int[]{1,3,5,7,9,11,13,15};
		// �迭�� ���� ����(shallow copy)
		//int[] arr2=arr1;
		// ���� ����
//		int[] arr2=new int[arr1.length];
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		//{5,7,9,11,13}
		int[] arr2=new int[10];
		// arraycopy(�����迭�̸�,����������ġ
		//			,Ÿ���̸�,Ÿ�ٽ�����ġ,������ġ�κ��� �);
		java.lang.System.arraycopy(arr1, 2, arr2, 5, 5);
		
		arr1[1]=100;
		System.out.println(java.util.Arrays.toString(arr2));
		
		
		arr1[1]=30;
		
//		for(int i=0; i<arr2.length; i++){
//			System.out.println(arr2[i]);
//		}

	}

}
