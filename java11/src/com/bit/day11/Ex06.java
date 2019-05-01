package com.bit.day11;

public class Ex06 {

	public static void main(String[] args) {
		// бс бс бс бс		i=0, j<4 j=3;	
		// бс бс бс 		i=1, j<3 j=2;
		// бс бс 			i=2, j<2 j=1;
		// бс			i=3, j<1 j=0;
		
		for(int j=0; j<4; j++){
			for(int i=0; i<4; i++){
				if(j>=3-i){
					System.out.print("бр ");
				}else{
					System.out.print("  ");
				}
//				if(i==3-j){break;}
			}
			System.out.println();
		}

	}

}
