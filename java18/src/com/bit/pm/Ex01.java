package com.bit.pm;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println(java.lang.Math.PI);
		double su1=3.14;
		System.out.println(Math.floor(su1)+","+Math.ceil(su1));
		System.out.println(Math.round(su1));
		su1=3.499999999;
		System.out.println(Math.floor(su1)+","+Math.ceil(su1));
		System.out.println(Math.round(su1));
		su1=3.5;
		System.out.println(Math.floor(su1)+","+Math.ceil(su1));
		System.out.println(Math.round(su1));
		su1=3.999;
		System.out.println(Math.floor(su1)+","+Math.ceil(su1));
		System.out.println(Math.round(su1));
		int a=100;
		int b=10;
		System.out.println(Math.max(a,b)+","+Math.min(a, b));
		double ran=Math.random();	// 0<= ran <1.0;
		System.out.println(ran);
		
		java.util.Random random=new Random(1234L);
		System.out.println(random.nextInt());
//		Integer.MIN_VALUE~Integer.MAX_VALUE
		int su2=3;
		System.out.println(random.nextInt(su2));
//		0<= <su1
		byte[] by={1,3,5};
		random.nextBytes(by);
		System.out.println(Arrays.toString(by));
		
	}

}















