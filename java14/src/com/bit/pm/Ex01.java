package com.bit.pm;

class Ex11{}

public class Ex01 extends com.bit.pm2.Ex11{
//	private < default <= protected < public
	
	public void func02(final int a){
		System.out.println("param a:"+a);
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		me.func01();
		me.func02(10000+1);
		me.func02(10000+2);
		
		
		
		
//		com.bit.pm2.Ex11 you=new com.bit.pm2.Ex11();
//		you.func01();
//		you.func02();
//		System.out.println(you.su1);
		
//		com.bit.pm2.Ex11.func03();
//		System.out.println(com.bit.pm2.Ex11.su2);
	}

}
