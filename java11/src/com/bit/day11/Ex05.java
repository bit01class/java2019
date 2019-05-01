package com.bit.day11;

public class Ex05 {

	public static void main(String[] args) {
		// бс			i=0, j=0 
		// бс бс 			i=1, j=1
		// бс бс бс 		i=2, j=2
		// бс бс бс бс		i=3, j=3
		// 1 +2
		// 2 3 +3
		// 4 5 6 +4
		// 7 8 9 10 +5
		
		int temp1=1;
		int temp2=1;
		int temp=1;
		
		for(int i=1; i<=21; i++){
			System.out.print(i*2+"\t");
			if(i==temp1){
				System.out.println();
				temp1=i+(++temp2);
			}
		}
		
		
//		for(int i=0; i<4; i++){
//			for(int j=0; j<4; j++){
////				if(j>i){continue;}
//				System.out.print("бс ");
//				if(i==j){break;}
////				if(j<=i){
////					System.out.print("бс ");
////				}
//			}
//			System.out.println();
//		}
		
//		for(int j=0; j<4; j++){
//			for(int i=0; i<1+j; i++){
//				System.out.print("бс ");
//			}			
//			System.out.println();
//		}
	}

}
