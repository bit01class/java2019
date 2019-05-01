package com.bit.day09;


public class Ex07{

  public static void main(String[] args){
	String[] arr2=new String[2];
	arr2[0]=new String("test1");
	arr2[0]=new String("test2");	


	int[][] arr1;
	arr1=new int[3][2];
	
	arr1[0]=new int[]{1,2};
	arr1[1]=new int[]{4,5,6};
	arr1[2]=new int[]{7,8};
	/*
	arr1[0][0]=11;
	arr1[0][1]=12;
	arr1[1][0]=14;
	arr1[1][1]=15;
	arr1[2][0]=17;
	arr1[2][1]=18;
	*/
	for(int i=0; i<arr1.length; i++){
		//for(int j=0; j<arr1[i].length; j++){
		//	System.out.print(arr1[i][j]+" ");
		//}
		System.out.println(arr1[i]);
	}

  }

}







