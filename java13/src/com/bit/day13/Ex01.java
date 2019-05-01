package com.bit.day13;

public class Ex01 {
	static int[] lotto=new int[7];

	public static void main(String[] args) {
		// 로또번호 생성기
		// 1. 랜덤(1~45)
		// 2. 6개 선출, 중복불가
		// 3. 오름차순 정렬
		String title="---------------------------------------";
		title+="\n로또번호 생성기(ver 0.0.1)\n";
		title+="---------------------------------------";
		System.out.println(title);
		lottoBall();
		sort();
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}
		System.out.println(", 뽀너스번호:"+lotto[6]);

	}
	
	public static void sort(){
		int temp=0;
		for(int i=0; i<6-1; i++){
			for(int j=i+1; j<6; j++){
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		return ;
	}
	
	
	public static void lottoBall(){
		//중복값검출
		for(int i=0; i<lotto.length; i++){
			lotto[i]=ranSu();
			for(int j=0; j<i ; j++){
				if(lotto[j]==lotto[i]){
					i--;
					break;
				}
			}
			
		}
		
		return ;
	}
	
	
	
	public static int ranSu2(){
		int su=0;
		su=(int)(Math.random()*45)+1;
		return su;
	}
	public static int ranSu(){
		int su=0;
		//불규칙(input(x) -> output(o))
		while(true){
			su=(int)(java.lang.Math.random()*1000000); // 0.00<= , 0.99<1.0
			if(su>0&&su<46){break;}
		}
		//1~45
		return su;
	}

}







































