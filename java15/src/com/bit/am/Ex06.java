package com.bit.am;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arr={0,3,5};
		int result=0;
		for(int i=0; i<100; i++){
			
			try{
					result=100/arr[i];
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열의 인덱스번호가 없음");
			}catch(ArithmeticException e){
				System.out.println("0으로 나눠서 오류발생");
			}catch(Exception e){
				System.out.println("몰라무조건 해결");
			}
			System.out.println("result="+result);
		}
	}

}








