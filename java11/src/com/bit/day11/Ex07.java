package com.bit.day11;

public class Ex07 {

	public static void main(String[] args) {
//	  	      бр 			i=0, j<=2 =2-i
//	  	    бр бр бр 		i=1, j<=1 =2-i
//	  	  бр бр бр бр бр 		i=2, j<=0 =2-i
//	  	бр бр бр бр бр бр бр 	i=3, j<=-1 =2-i
		
//	бр 		
//	бр бр бр 		
//	бр бр бр бр бр 	
//	бр бр бр бр бр бр бр
		int temp=1;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				if(j<4-i-1){
					System.out.print("  ");
				}
			}
			
			for(int j=0; j<temp; j++){
				System.out.print("бр ");
			}
			temp+=2;
			System.out.println();
		}
//		бс бс бс 	i=0, j<4 =4-i-1
//		бс бс 	i=1, j<3 =4-i-1
//		бс 		i=2, j<2 =4-i-1
//				i=3, j<1 =4-i-1
//		for(int i=0; i<4; i++){
//			for(int j=0; j<4; j++){
//				if(j<4-i-1){
//					System.out.print("бс ");
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
//				System.out.print("бр ");
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
//				System.out.print("бр ");
//				}
//			}
//			for(int j=0; j<4; j++){
//				if(j<i){System.out.print("бр ");}
//			}
//			System.out.println();
//		}
	}

}
















