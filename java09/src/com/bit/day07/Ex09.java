/*

Q1. A~Z���� ����Ͻÿ�

Q2. 3�� ����� ����Ͻÿ�
	3+6+9+12+15+18+21+24+27 =????
Q3. 2�� ������ ����Ͻÿ� 
	2��1�� 2��2�� 2��3�� 2��4�� 2��5�� 2��6�� 2��7�� 2��8�� 
Q4. ������ ����Ͻÿ� 
 �� �� �� �� 5(\n)
 �� �� �� �� 10
 �� �� �� �� 15
 �� �� �� �� 20

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
			System.out.print('��');
		}
		System.out.println();
	}
	System.out.println("\n--------------");
	for(int i=1; i<20; i++){
		if(i%5==0){
		System.out.println();
		}else{
		System.out.print('��');
		}
	}
  }

}


































