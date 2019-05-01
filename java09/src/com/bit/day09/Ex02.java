package com.bit.day09;

public class Ex02{

  public static void main(String[] args){
	String msg1="ja";
	String msg2="va";

	System.out.println(msg1+msg2);

	String msg3=msg1.concat(msg2);
	System.out.println(msg3);

	System.out.println("msg3 length:"+msg3.length());

	String msg4=" ";
	System.out.println(msg4);
	System.out.println(msg4.length()==0);
	System.out.println(msg4.isEmpty());
	String msg5="abcdefg";// 0~length-1
	for(int i=0; i<msg5.length(); i++){
	System.out.println(msg5.charAt(i));
	}
	System.out.println("-------------------------");
	char[] chs=msg5.toCharArray();
	for(int i=0; i<chs.length; i++){
		System.out.println(chs[i]);
	}
	System.out.println("-------------------------");
	String msg6=new String(chs);
	System.out.println(msg6);
	System.out.println("-------------------------");
	msg5="abc";
	byte[] bys=msg5.getBytes();
	for(int i=0; i<bys.length; i++){
		System.out.println(bys[i]);
	}
	System.out.println("-------------------------");
	String msg7=new String(bys);
	
	char[] chs2=new char[bys.length];
	for(int i=0; i<chs2.length;i++){
		chs2[i]=(char)bys[i];
	}
	String msg8=String.valueOf(chs2);

	String msg9="";

	for(int i=0; i<bys.length; i++){
		msg9+=String.valueOf((char)bys[i]);
	}

	System.out.println(msg7);
	System.out.println(msg8);
	System.out.println(msg9);
  }


}














