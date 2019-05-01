package com.bit.day12;

public class Ex08 {

	public static void main(String[] args) {
		// 로또 번호 생성기
		int[] ball =new int[45];
		for(int i=0; i<ball.length; i++){
			ball[i]=i+1;
		}
		
		
		// 1~44		0<=ran<1   *10   0<=ran<=9  +1 1<=ran<=10
		for(int i=0; i<10000; i++){
			int ran=(int)(Math.random()*44+1);
			int temp=ball[0];
			ball[0]=ball[ran];
			ball[ran]=temp;
		}
		
		
		for(int i=0; i<6; i++){
			System.out.println(ball[i]);
		}

	}

}
