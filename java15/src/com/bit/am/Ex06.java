package com.bit.am;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arr={0,3,5};
		int result=0;
		for(int i=0; i<100; i++){
			
			try{
					result=100/arr[i];
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�迭�� �ε�����ȣ�� ����");
			}catch(ArithmeticException e){
				System.out.println("0���� ������ �����߻�");
			}catch(Exception e){
				System.out.println("�������� �ذ�");
			}
			System.out.println("result="+result);
		}
	}

}








