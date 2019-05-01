package com.bit.day13;

public class Ex03 {

	public static void main(String[] args) {
		java.lang.StringBuffer msg1=new StringBuffer("java");
		StringBuffer msg2=new StringBuffer("World");
//		StringBuffer msg3=msg1+msg2;
//		String msg4="abc";
//		String msg5=msg4.concat("123");
		// 추가
		StringBuffer msg3=msg1.append(msg2);
		System.out.println(msg3);
		// 수정
		msg3.replace(4, 5, "w");
		System.out.println(msg3);
		System.out.println(msg1);
		
		msg1.append("!!!!!");
		System.out.println(msg1);
		msg1.append(1234);
		System.out.println(msg1);
		// 삭제
		msg1.delete(4, 9);
		System.out.println(msg1);
		// 추가
		msg1.insert(4, "web");
		System.out.println(msg1);
		System.out.println("length:"+msg1.length());
		
		StringBuffer msg5=new StringBuffer("   java web   ");
		msg5.trimToSize();
		System.out.println(msg5);
		System.out.println(msg5.length());
		System.out.println(msg5.capacity());
		
		msg5.setLength(100);
		msg5.trimToSize();
		System.out.println(msg5);
		System.out.println(msg5.length());
		System.out.println(msg5.capacity());
	}

}




















