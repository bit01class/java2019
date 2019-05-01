package com.bit.pm2;

public class Ex11 {
	final int su1;
//	protected int su1=1234;
//	protected static int su2=4321;

	public Ex11() {
		su1=1234;
	}

	public final void func01(){
		final int su2=1111;
//		su2++;
		System.out.println("pm2패키지의 Ex11 func01..."+su2);
	}
	

	
//	protected void func02(){
//		System.out.println("pm2패키지의 Ex11 func02...");
//	}
//	protected static void func03(){
//		System.out.println("pm2패키지의 Ex11 func03...");
//	}
}
