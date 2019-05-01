package com.bit.day09;

public class Ex05{
  // 변수
  int su1=1234;	// 인스턴스필드
  static int su2=4321; // 클래스변수
  
  public Ex05(){
	// 객체 생성시점
	su1=1000;
  }

  public static void main(String[] args){
	int su=abs(-123);
	System.out.println("su="+su);
	String msg=func01(5,1,3);
	System.out.println(msg);

	int[] arr={5, 1, 23};
	int temp=0;
	if(arr[0]<arr[1] && arr[0]<arr[2]&& arr[1]>arr[2]){
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
	}else if(arr[1]<arr[0] && arr[1]<arr[2]&&arr[1]<arr[2]){
			temp=arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
	}else if(arr[1]<arr[0] && arr[1]<arr[2]&&arr[1]>arr[2]){
			temp=arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
	}else if(arr[2]<arr[0] && arr[2]<arr[1]&&arr[1]<arr[2]){
			temp=arr[0];
			arr[0]=arr[2];
			arr[2]=temp;
	}else if(arr[2]<arr[0] && arr[2]<arr[1]&&arr[1]>arr[2]){
			temp=arr[0];
			arr[0]=arr[2];
			arr[2]=temp;
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
	}

	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+ " ");
	}
	System.out.println();

  }

  public static String func01(int a, int b, int c){
	// 1 < 3 < 5
	String msg=null;
	if(a<b&&a<c&&b<c){msg=a+" < "+b+" < "+c;}
	else if(a<b&&a<c&&c<b){msg=a+" < "+c+" < "+b;}
	else if(b<c&&b<a&&a<c){msg=b+" < "+a+" < "+c;}
	else if(b<c&&b<a&&c<a){msg=b+" < "+c+" < "+a;}
	else if(c<a&&c<b&&a<b){msg=c+" < "+a+" < "+b;}
	else if(c<a&&c<b&&b<a){msg=c+" < "+b+" < "+a;}


	System.out.println("실행끝");
	
	return msg;
  }

  public static int abs(int a){
	if(a<0){
		//a=-a;
		a*=-1;
	}
	return a;
  }


  // 메서드
  public static void func01(){
	System.out.println("static 메서드");
	com.bit.day09.Ex05.func04();
  }

  public static void func04(){
	System.out.println("static 메서드"+com.bit.day09.Ex05.su2);
  }



  public void func02(){
	System.out.println("non-static 메서드");
	this.func03();
  }

  public void func03(){
	System.out.println("non-static 메서드"+this.su1);
  }

}










