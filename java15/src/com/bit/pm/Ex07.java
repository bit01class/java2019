package com.bit.pm;

public class Ex07 {
	static int su1=1111;
	int su2=2222;

	static class Inner03{
		static int su1=1000;
		
		static void func01(){
			System.out.println(su1);
			System.out.println(Ex07.su1);
			Ex07 out=new Ex07();
			System.out.println(out.su2);
			func03();
			out.func04();
		}
		void func02(){
			System.out.println(su1);
			func03();
			Ex07 out=new Ex07();
			System.out.println(out.su2);
			out.func04();
		}
	}
	
	static void func03(){
		System.out.println("Outter-static-func03");
	}
	void func04(){
		System.out.println("Outter-non-func04");
	}
	
	
	
	public static void main(String[] args) {

	}

}
