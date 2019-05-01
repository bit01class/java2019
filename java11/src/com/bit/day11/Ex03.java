package com.bit.day11;

public class Ex03 {

	public static void main(String[] args) {
		// 3+6+9+12+15+18+21+24+27=????
		int sum=0;
		for(int i=1; i<10; i++){
			if(i!=1){
				System.out.print('+');
			}
			System.out.print(3*i);
			sum+=3*i;
		}
		System.out.println("="+sum);
	}

}
