package com.bit.am;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(Ex101.su10);
		Ex101.func21();
		Ex101 ex1=new Ex101();
		System.out.println(ex1.su11);
		ex1.func22();
		///////////////////////////////
		Ex01 me=new Ex01();
//		Ex102 ex2=me.new Ex102();
		Ex102 ex2=new Ex01().new Ex102();
		System.out.println(ex2.su12);
		ex2.func23();
		
		
		me.func02().func24();
		
		
		
		Ex99 me2=new Ex99(){
			public void func24(){
				
			}
		};
		me2.func24();
		
	}
	
	
	static int su1=1111;
	
	static class Ex101{
		static int su10=10;
		int su11=11;
		static void func21(){
			System.out.println(su1);
		}
		void func22(){}
	}
	
	int su2=2222;
	class Ex102{
		int su12=12;
		void func23(){
			System.out.println(su1);
			System.out.println(su2);
			func01();
			func02();
		}
	}
	
	public static void func01(){
		int su3=3333;
		class Ex103{
			int su13=13;
			void func24(){}
		}
		Ex103 local=new Ex103();
		System.out.println(local.su13);
		local.func24();
	}
	
	public Ex99 func02(){
		int su3=3333;
		
		return new Ex99(){
			// 오버라이드
			public void func24(){
				System.out.println("새로운기능");
			}
		};
	}

	interface Ex99{
		void func24();
	}
	
	Ex99 inter1=new Ex99(){
		public void func24(){
			
		}
	};

}




















