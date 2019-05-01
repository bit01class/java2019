package com.bit.pm;


public class Ex10 {

	interface Inter{
		void func10();
	}
	
	static Inter func01(){
		
		return new Inter(){
			public void func10(){
				System.out.println("Inner func10");
			}
		};
		
	}
		
	public static void main(String[] args) {
		Inter me=func01();
		me.func10();
	}

}














