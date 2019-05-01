package com.bit.day11;

public class Ex02 {

	public static void main(String[] args) {
		// 2+4+8+16+32+64=???
		// 2	=1*2
		// 4	=1*2*2
		// 8	=1*2*2*2
		// 16	=1*2*2*2*2
		// 32	=1*2*2*2*2*2
		// 64	=1*2*2*2*2*2*2
//		for(int j=0; j<6; j++){
//			int su=1;
//			for(int i=0; i<j+1; i++){
//				//System.out.print("*2");
//				su*=2;
//			}
//			System.out.println(su);
//		}
		int sum=1;
		
		for(int i=0; i<6; i++){
			sum*=2;
			if(i!=0){System.out.print('+');}
			System.out.print(sum);
		}
		
	}

}



















