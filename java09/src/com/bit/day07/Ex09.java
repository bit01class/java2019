/*

Q1. A~Z까지 출력하시오

Q2. 3의 배수를 출력하시오
	3+6+9+12+15+18+21+24+27 =????
Q3. 2의 제곱을 출력하시오 
	2의1승 2의2승 2의3승 2의4승 2의5승 2의6승 2의7승 2의8승 
Q4. 다음을 출력하시오 
 ■ ■ ■ ■ 5(\n)
 ■ ■ ■ ■ 10
 ■ ■ ■ ■ 15
 ■ ■ ■ ■ 20

*/

package com.bit.day07;

public class Ex09{

  public static void main(String[] args){
	int cnt='Z'-'A'+1;
	/*
	for(int i=0; i<cnt; i++){
	System.out.print((char)('A'+i)+" ");	
	}
	for(int i=(int)'A'; i<=(int)'Z'; i++){
	System.out.print((char)i+" ");
	}
	
	*/
	cnt=0;
	while(true){
		System.out.print((char)('A'+cnt)+" ");
		if((char)('A'+cnt)=='Z'){break;}
		cnt++;
	}


	System.out.println("\n--------------");
	/*
	for(int i=3; i<30; i+=3){
		if(i!=3){System.out.print("+");}
		System.out.print(i);
	}
	*/
	for(int i=1; i<10; i++){
		if(i!=1){System.out.print("+");}
		System.out.print(3*i);
	}
	System.out.println("\n--------------");
	System.out.println(1*2);
	System.out.println(1*2*2);
	System.out.println(1*2*2*2);
	System.out.println(1*2*2*2*2);
	System.out.println(1*2*2*2*2*2);
	System.out.println(1*2*2*2*2*2*2);
	cnt=0;
	int sum=1;
	for(int i=0; i<8; i++){
		sum=1;
		for(int j=0; j<=i; j++){
		sum*=2;
		}
		System.out.println(sum);
	}
	System.out.println("\n--------------");
	for(int i=0; i<4; i++){
		for(int j=0; j<4; j++){
			System.out.print('■');
		}
		System.out.println();
	}
	System.out.println("\n--------------");
	for(int i=1; i<20; i++){
		if(i%5==0){
		System.out.println();
		}else{
		System.out.print('■');
		}
	}
  }

}


































