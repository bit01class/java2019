package com.bit.day11;

public class Ex07 {

	public static void main(String[] args) {
//	  	      �� 			i=0, j<=2 =2-i
//	  	    �� �� �� 		i=1, j<=1 =2-i
//	  	  �� �� �� �� �� 		i=2, j<=0 =2-i
//	  	�� �� �� �� �� �� �� 	i=3, j<=-1 =2-i
		
//	�� 		
//	�� �� �� 		
//	�� �� �� �� �� 	
//	�� �� �� �� �� �� ��
		int temp=1;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				if(j<4-i-1){
					System.out.print("  ");
				}
			}
			
			for(int j=0; j<temp; j++){
				System.out.print("�� ");
			}
			temp+=2;
			System.out.println();
		}
//		�� �� �� 	i=0, j<4 =4-i-1
//		�� �� 	i=1, j<3 =4-i-1
//		�� 		i=2, j<2 =4-i-1
//				i=3, j<1 =4-i-1
//		for(int i=0; i<4; i++){
//			for(int j=0; j<4; j++){
//				if(j<4-i-1){
//					System.out.print("�� ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
//		1-4 2-4 3-4 4-4 5-4 6-4 7-4
//		1-4 2-4 3-4 4-4 5-4 6-4 7-4
//		1-4 2-4 3-4 4-4 5-4 6-4 7-4
//		1-4 2-4 3-4 4-4 5-4 6-4 7-4
		
//		-3 -2 -1 0 1 2 3	if(i>=0, i<=0)
//		-3 -2 -1 0 1 2 3	if(i>=-1, i<=1)
//		-3 -2 -1 0 1 2 3	if(i>=-2, i<=2)
//		-3 -2 -1 0 1 2 3	if(i>=-3, i<=3)
		///////////////////////////////////////////
//		for(int j=0; j<4; j++){
//			for(int i=-3; i<=3; i++){
//				if(i>=j*-1 && i<=j){
//				System.out.print("�� ");
//				}else{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		///////////////////////////////////////////
//		for(int i=0; i<4; i++){
//			for(int j=0; j<4; j++){
//				if(j<=2-i){
//					System.out.print("  ");
//				}else{
//				System.out.print("�� ");
//				}
//			}
//			for(int j=0; j<4; j++){
//				if(j<i){System.out.print("�� ");}
//			}
//			System.out.println();
//		}
	}

}
















