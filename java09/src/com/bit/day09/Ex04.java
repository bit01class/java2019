/*
Q1. 절대값을 반환받는 abs(-123) -> 123 메서드를 만드시오

Q2. 1/2+2/3+3/4+4/5+5/6+...999998/999999+999999/1000000=???

Q3. 	func01(5,1,3)
	String func01(int a, int b, int c)
	return String으로 오름차순 문자열을 리턴받도록 하라
	ex) "1 < 3 < 5"

Q4.{5,1,3}
	오름차순 배열로 출력하시오	{1,3,5}



*/
package com.bit.day09;

public class Ex04{

  public static void main(String[] args){
	//1/2+2/3+3/4+4/5+5/6+...999998/999999+999999/1000000=???
	double sum=0.0;
	for(int i=1; i<1000000; i++){
		sum+=i*1.0/(i+1);
	}
	System.out.println("1/2+2/3+...+999999/1000000="+sum);
	System.out.println("-------------------------------");
	sum=0.0;
	for(int i=2; i<=1000000; i++){
		sum+=(1-1.0/i);
	}
	System.out.println("1/2+2/3+...+999999/1000000="+sum);
	
  }

}


















