package com.bit.day11;
/*
Q1. 1~100까지 합계는 무엇인가요?

Q2. 다음을 출력하시오
	1	3	5	7	9
Q3. 1~100중 짝수들의 합계를 구하시오

Q4. 구구단 7단을 출력하세요

Q5. 다음을 출력하세요
	3+6+9+12+15+18+21+24+27=????

*/
public class Ex01 {

	public static void main(String[] args) {
		//Q1. 1~100까지 합계는 무엇인가요?
		int sum=0;
		for(int i=1; i<=10; i++){
			if(i%3==0){
				if(i!=3){
					System.out.print("+");
				}
				System.out.print(i);
				sum+=i;
				
			}
		}
		System.out.println("="+sum);
	}

}



















