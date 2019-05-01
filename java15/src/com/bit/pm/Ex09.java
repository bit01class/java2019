package com.bit.pm;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start");
		int a=1;
		func01(a);
		a++;
		func01(a);
		a++;
		func01(a);
		System.out.println("main end");
	}
	
	public static void func01(){
		
		final int a=1111;
		class Inner{
			int su1=1111;
			final static int su2=2222;
			
			public Inner() {}
			
			void func10(){
				System.out.println("local-func10()..."+a);
			}
			void func11(int b){
				System.out.println("local-func10()..."+b);
			}
		}
		Inner inn=new Inner();
		System.out.println(inn.su1);
		System.out.println(Inner.su2);
		inn.func10();
		inn.func11(a);
		return;
	}
	// ~1.7, 1.8~
	public static void func01(final int a){
		class Inner{
			int su1=1111;
			final static int su2=2222;
			
			public Inner() {}
			
			void func10(){
				System.out.println("local-func10()..."+a);
			}
			void func11(int b){
				System.out.println("local-func10()..."+b);
			}
		}
		Inner inn=new Inner();
		System.out.println(inn.su1);
		System.out.println(Inner.su2);
		inn.func10();
		inn.func11(a);
		return;
	}
	
//	public void func02(){
//		int a=2222;
//		class Inner{
//			
//		}
//	}

}
