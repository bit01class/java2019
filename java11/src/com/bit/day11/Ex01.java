package com.bit.day11;
/*
Q1. 1~100���� �հ�� �����ΰ���?

Q2. ������ ����Ͻÿ�
	1	3	5	7	9
Q3. 1~100�� ¦������ �հ踦 ���Ͻÿ�

Q4. ������ 7���� ����ϼ���

Q5. ������ ����ϼ���
	3+6+9+12+15+18+21+24+27=????

*/
public class Ex01 {

	public static void main(String[] args) {
		//Q1. 1~100���� �հ�� �����ΰ���?
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



















