package com.bit.day08;

/*
배열 - 동일타입변수
선언 자료형[] 배열명 = new 자료형[배열사이즈];
호출 배열명[인덱스]
인덱스 시작은 0부터 반드시 연속됨, 번호의 끝은 배열사이즈-1

선언과 초기화동시 
자료형[] 변수명=new 자료형[]{값,값,값...}; 

자료형[] 변수명={값,값,값...};


*/

public class Ex08{

  public static void main(String[] my){
	//System.out.println("args[0]="+my[0]);
	int a1=10;
	int a2=11;
	int a3=12;
	int a4=13;
	int a5=14;

	int[] array=new int[5];
	//array[0]=10;
	//array[1]=11;
	//array[2]=12;
	//array[3]=13;
	//array[4]=14;

	for(int i=0; i<5; i++){
		array[i]=10+i;
	}
	
	for(int i=0; i<5; i++){
		System.out.println("array["+i+"]="+array[i]);
	}

	int[] array2=new int[]{1,3,5,6,7};
	String[] strs=new String[]{"java","web","db","framework"};
	for(int i=0; i<4; i++){
	  System.out.println(strs[i]);

	}

	int[] array3={1,3,5,6,7};


  }


}














