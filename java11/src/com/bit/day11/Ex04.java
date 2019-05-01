package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		//  бс бс бс бс
		//  бс бс бс бс
		//  бс бс бс бс
		//  бс бс бс бс
		
		
		String mark="бс ";
		int su=1;
		for(int i=0; i<20; i++){
			if(i%5==0){
				System.out.println();
			}else{
			System.out.print(su+++"\t");
			}
			
		}
		
//		for(int i=0; i<4; i++){
//			//System.out.println("бс бс бс бс");
//			for(int j=0; j<4; j++){
//				System.out.print((i+1)*(j+1));
//			}
//			System.out.println();
//		}

	}

}













