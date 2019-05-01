package com.bit.day11;

public class Ex08 {

	public static void main(String[] args) {
		// A~ZÃâ·Â
		// A(a),B(b),C(c)~~~~ Z(z)
		char ch='A';
		int gap='a'-'A';
		for(int i=0; i<'Z'-'A'+1; i++){
			if(i!=0){
				System.out.print(',');				
			}
			System.out.print((char)(ch+i));
			System.out.print('(');
			System.out.print((char)(ch+i+gap));
			System.out.print(')');
		}
	}

}
