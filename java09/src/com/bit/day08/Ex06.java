package com.bit.day08;

public class Ex06{

  public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int input=0;
	int money=0;
	while(true){
		System.out.print("1.입금 2.출금 3.잔액보기 0.종료>");
		input=sc.nextInt();	
		if(input==0){break;}
		else if(input==1){
			money+=push();
		}else if(input==2){
			money-=pull(sc);
		}else if(input==3){
			show(money);
		}
	}

  }
  public static int push(){	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("입금액>");
	return sc.nextInt();
  }
  public static int pull(java.util.Scanner sc){
	//java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.print("인출액>");
	int su=sc.nextInt();
	return su;
  }
  public static void show(int su){
	System.out.println("현재 잔고:"+su+"원");
  }
}







