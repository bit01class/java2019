package com.bit.day09;

public class Ex01{

  public static void main(String[] args){
	String msg1="java";
	String msg2="java";
	String msg3=new String("java");	
	String msg4=args[0];
	String msg5="java";

	System.out.println("msg1:"+msg1);
	System.out.println("msg2:"+msg2);
	System.out.println("msg3:"+msg3);
	System.out.println("msg4:"+msg4);
	System.out.println("msg5:"+msg5);
	System.out.println(msg1==msg2);
	System.out.println(msg1==msg3);
	System.out.println(msg1==msg4);
	System.out.println(msg3==msg4);
	System.out.println(msg1==msg5);
	System.out.println("--------------------");
	System.out.println(msg1.equals(msg2));
	System.out.println(msg1.equals(msg3));
	System.out.println(msg1.equals(msg4));
	System.out.println(msg3.equals(msg4));
	System.out.println(msg1.equals(msg5));
	System.out.println("--------------------");
	System.out.println(msg1=="java");
	System.out.println(msg1=="ja"+"va");
	String ja="ja";
	String va="va";
	System.out.println(msg1==ja+va);

	

  }

}
















