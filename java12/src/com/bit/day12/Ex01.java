package com.bit.day12;

public class Ex01 {

	public static void main(String[] args) {
		int a0=1;
		int a1=2;
		int a2=3;
		int[] arr;// 배열의 선언
//		arr=new int[]{1,2,3}; // 초기화
		arr=new int[3]; // 초기화
//		for(int i=0; i<3; i++){
//			System.out.println(arr[i]);
//		}
		int[][] arrs=new int[3][];
		arrs[0]=new int[1];
		arrs[1]=new int[]{1,2};
		arrs[2]=new int[3];
		System.out.println(arrs[1][1]);
		
		int[][] arrs2=new int[][]{{1},{1,2},{1,2,3}};
		int[][] arrs5=new int[][]{	new int[]{1},
									new int[]{1,2},
									new int[]{1,2,3}
									};
		
		int[][] arrs3={
						{10},
						{10,20},
						{10,20,30}
					   };
		
		int[][] arrs4={
				new int[]{10},
				new int[]{10,20},
				new int[]{10,20,30}
		};
		
		for(int i=0; i<arrs3.length; i++){
			System.out.print("[");
			for(int j=0; j<arrs3[i].length; j++){
				System.out.print(arrs3[i][j]+",");
			}
			System.out.println("]");
		}
	}

}













