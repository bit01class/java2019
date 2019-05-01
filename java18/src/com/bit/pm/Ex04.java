package com.bit.pm;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(Long.MAX_VALUE-System.currentTimeMillis());
		java.util.Date now=new Date();
		for(int i=0; i<100000; i++){
			now=new Date();
		System.out.println(now);
		}
	}

}
